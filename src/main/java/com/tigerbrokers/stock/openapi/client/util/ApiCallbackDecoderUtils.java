package com.tigerbrokers.stock.openapi.client.util;

import com.alibaba.fastjson.JSONObject;
import com.tigerbrokers.stock.openapi.client.socket.ApiCallbackDecoder;
import com.tigerbrokers.stock.openapi.client.socket.IdleTriggerHandler;
import com.tigerbrokers.stock.openapi.client.socket.WebSocketClient;
import com.tigerbrokers.stock.openapi.client.socket.WebSocketHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.stomp.StompFrame;
import io.netty.handler.timeout.IdleStateHandler;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

import static com.tigerbrokers.stock.openapi.client.socket.WebSocketClient.connectCountDown;
import static io.netty.handler.codec.stomp.StompHeaders.HEART_BEAT;

/**
 * @author  zhaolei
 * @since  2018/12/20
 * 描述
 */
public class ApiCallbackDecoderUtils {

  public final static String IDLE_STATE_HANDLER = "idleStateHandler";
  public final static String IDLE_TRIGGER_HANDLER = "idleTriggerHandler";

  public static void executor(ChannelHandlerContext ctx, StompFrame frame, ApiCallbackDecoder decoder)
      throws Exception {
    if (null == decoder || null == ctx) {
      return;
    }

    switch (frame.command()) {
      case CONNECTED:
        if (decoder.getCallback() != null) {
          if (frame.headers().contains(HEART_BEAT)) {
            String value = frame.headers().getAsString(HEART_BEAT);
            if (!StringUtils.isEmpty(value)) {
              String[] arrayValue = value.split(",");
              if (null != arrayValue && arrayValue.length >= 2) {
                int serverSendInterval = StringUtils.isEmpty(arrayValue[0]) ? 0 : Integer.valueOf(arrayValue[0]);
                int serverReceiveInterval = StringUtils.isEmpty(arrayValue[1]) ? 0 : Integer.valueOf(arrayValue[1]);
                if (serverSendInterval > 0 || serverReceiveInterval > 0) {
                  if (null == ctx.channel().pipeline().get(IDLE_STATE_HANDLER)) {
                    serverSendInterval =
                        serverSendInterval == 0 ? 0 : serverSendInterval + WebSocketHandler.HEART_BEAT_SPAN;
                    serverReceiveInterval =
                        serverReceiveInterval == 0 ? 0 : serverReceiveInterval - WebSocketHandler.HEART_BEAT_SPAN;

                    ctx.channel().pipeline().addBefore(WebSocketClient.STOMP_ENCODER, IDLE_STATE_HANDLER,
                        new IdleStateHandler(serverSendInterval, serverReceiveInterval, 0, TimeUnit.MILLISECONDS));

                    ctx.channel()
                        .pipeline()
                        .addAfter(IDLE_STATE_HANDLER, IDLE_TRIGGER_HANDLER, new IdleTriggerHandler(decoder));
                  }
                }
                decoder.getCallback().connectionAck(serverSendInterval, serverReceiveInterval);
              } else {
                decoder.getCallback().connectionAck();
              }
            } else {
              decoder.getCallback().connectionAck();
            }
          } else {
            decoder.getCallback().connectionAck();
          }
        }
        connectCountDown.countDown();
        break;
      case MESSAGE:
        decoder.handle(frame);
        break;
      case RECEIPT:
        break;
      case ERROR:
        if (decoder.getCallback() != null) {
          if (frame != null && frame.content() != null) {
            String content = frame.content().toString(Charset.defaultCharset());
            decoder.getCallback().error(content);
          } else if (frame != null) {
            decoder.getCallback().error(JSONObject.toJSONString(frame));
          } else {
            decoder.getCallback().error("unknown error");
          }
        }
        break;
      case DISCONNECT:
        if (decoder.getCallback() != null) {
          decoder.getCallback().connectionClosed();
        }
        ctx.close();
        break;
      case UNKNOWN:
        ctx.close();
        break;
      default:
        break;
    }
  }
}
