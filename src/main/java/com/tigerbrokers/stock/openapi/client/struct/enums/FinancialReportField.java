package com.tigerbrokers.stock.openapi.client.struct.enums;

/**
 * Description:
 * Created by lijiawen on 2019/01/18.
 */
public enum FinancialReportField {
  cashAndEquivalents("cash_and_equivalents", 1096L, 0),
  shortTermInvestments("short_term_investments", 1069L, 0),
  tradingAssetSecurities("trading_asset_securities", 1244L, 0),
  totalCash_stInvestments("total_cash_st_investments", 1002L, 0),
  accountsReceivable("accounts_receivable", 1021L, 0),
  otherReceivables("other_receivables", 1206L, 0),
  notesReceivable("notes_receivable", 1048L, 0),
  totalReceivables("total_receivables", 1001L, 0),
  inventory("inventory", 1043L, 0),
  prepaidExp("prepaid_exp", 1212L, 0),
  financeDivLoansAndLeasesSt("finance_div_loans_and_leases_st", 1032L, 0),
  financeDivOtherCurrAssets("finance_div_other_curr_assets", 1029L, 0),
  otherCurrentAssetsTotal("other_current_assets_total", 1267L, 0),
  loansHeldForSale("loans_held_for_sale", 1185L, 0),
  deferredTaxAssetsCurr("deferred_tax_assets_curr", 1117L, 0),
  restrictedCash("restricted_cash", 1104L, 0),
  otherCurrentAssets("other_current_assets", 1055L, 0),
  totalCurrentAssets("total_current_assets", 1008L, 0),
  grossPropertyPlant_equipment("gross_property_plant_equipment", 1169L, 0),
  accumulatedDepreciation("accumulated_depreciation", 1075L, 0),
  netPropertyPlant_equipment("net_property_plant_equipment", 1004L, 0),
  longtermInvestments("longterm_investments", 1054L, 0),
  goodwill("goodwill", 1171L, 0),
  otherIntangibles("other_intangibles", 1040L, 0),
  financeDivLoansAndLeasesLt("finance_div_loans_and_leases_lt", 1033L, 0),
  financeDivOtherLtAssets("finance_div_other_lt_assets", 1034L, 0),
  otherAssetsTotal("other_assets_total", 1272L, 0),
  capitalizedpurchasedSoftware("capitalizedpurchased_software", 1243L, 0),
  accountsReceivableLongterm("accounts_receivable_longterm", 1088L, 0),
  loansReceivableLongterm("loans_receivable_longterm", 1050L, 0),
  deferredTaxAssetsLt("deferred_tax_assets_lt", 1026L, 0),
  deferredChargesLt("deferred_charges_lt", 1025L, 0),
  otherLongtermAssets("other_longterm_assets", 1060L, 0),
  totalAssets("total_assets", 1007L, 0),
  accountsPayable("accounts_payable", 1018L, 0),
  accruedExp("accrued_exp", 1016L, 0),
  totalShorttermBorrowings("total_shortterm_borrowings", 1046L, 0),
  currPortOfLtDebtcapLeases("curr_port_of_lt_debtcap_leases", 1279L, 0),
  currPortOfLongTermDebt("curr_port_of_long_term_debt", 1297L, 0),
  currPortOfCapLeases("curr_port_of_cap_leases", 1090L, 0),
  financeDivDebtCurrent("finance_div_debt_current", 1030L, 0),
  financeDivOtherCurrLiab("finance_div_other_curr_liab", 1031L, 0),
  otherCurrentLiabilitiesTotal("other_current_liabilities_total", 1269L, 0),
  currIncomeTaxesPayable("curr_income_taxes_payable", 1094L, 0),
  unearnedRevenueCurrent("unearned_revenue_current", 1074L, 0),
  defTaxLiabilityCurr("def_tax_liability_curr", 1119L, 0),
  otherCurrentLiabilities("other_current_liabilities", 1057L, 0),
  totalCurrentLiabilities("total_current_liabilities", 1009L, 0),
  longtermDebt("longterm_debt", 1049L, 0),
  capitalLeases("capital_leases", 1183L, 0),
  financeDivDebtNoncurr("finance_div_debt_noncurr", 1035L, 0),
  financeDivOtherNoncurrLiab("finance_div_other_noncurr_liab", 1036L, 0),
  otherLiabilitiesTotal("other_liabilities_total", 1282L, 0),
  unearnedRevenueNoncurrent("unearned_revenue_noncurrent", 1256L, 0),
  pension_otherPostretireBenefits("pension_other_postretire_benefits", 1213L, 0),
  defTaxLiabilityNoncurr("def_tax_liability_noncurr", 1027L, 0),
  otherNoncurrentLiabilities("other_noncurrent_liabilities", 1062L, 0),
  totalLiabilities("total_liabilities", 1276L, 0),
  prefStockRedeemable("pref_stock_redeemable", 1217L, 0),
  prefStockNonredeem("pref_stock_nonredeem", 1216L, 0),
  prefStockConvertible("pref_stock_convertible", 1214L, 0),
  prefStockOther("pref_stock_other", 1065L, 0),
  commonStock("common_stock", 1103L, 0),
  totalPrefEquity("total_pref_equity", 1005L, 0),
  commonStock_apic("common_stock_apic", 1270L, 0),
  additionalPaidInCapital("additional_paid_in_capital", 1084L, 0),
  retainedEarnings("retained_earnings", 1222L, 0),
  treasuryStock_other("treasury_stock_other", 1281L, 0),
  treasuryStock("treasury_stock", 1248L, 0),
  comprehensiveIncAndOther("comprehensive_inc_and_other", 1028L, 0),
  totalCommonEquity("total_common_equity", 1006L, 0),
  minorityInterest("minority_interest", 1052L, 0),
  totalEquity("total_equity", 1275L, 0),
  totalLiabilitiesAndEquity("total_liabilities_and_equity", 1013L, 0),
  numberOfEquityCapitalStructureShareClasses("number_of_equity_capital_structure_share_classes", 25214L, 0),
  totalSharesOutOnFilingDate("total_shares_out_on_filing_date", 24153L, 0),
  totalSharesOutOnBalanceSheetDate("total_shares_out_on_balance_sheet_date", 24152L, 0),
  bookValueshare("book_valueshare", 4020L, 0),
  bookValueshareReported("book_valueshare_reported", 3024L, 0),
  tangibleBookValue("tangible_book_value", 1310L, 0),
  tangibleBookValueshare("tangible_book_valueshare", 4156L, 0),
  tangibleBookValueshareReported("tangible_book_valueshare_reported", 35387L, 0),
  totalIntangibles("total_intangibles", 35381L, 0),
  totalDebt("total_debt", 4173L, 0),
  totalCurrentDebt("total_current_debt", 25223L, 0),
  totalNoncurrentDebt("total_noncurrent_debt", 25224L, 0),
  netDebt("net_debt", 4364L, 0),
  totalRedeemableMinorityInterest("total_redeemable_minority_interest", 41570L, 0),
  totalMinorityInterest("total_minority_interest", 1312L, 0),
  cashPerShare("cash_per_share", 4381L, 0),
  totalCapital("total_capital", 4175L, 0),
  workingCapital("working_capital", 4165L, 0),
  netWorkingCapital("net_working_capital", 1311L, 0),
  liquidationValueOfPreferredStock_convertible("liquidation_value_of_preferred_stock_convertible", 3104L, 0),
  liquidationValueOfPreferredStock_nonredeemable("liquidation_value_of_preferred_stock_nonredeemable", 3105L, 0),
  liquidationValueOfPreferredStock_redeemable("liquidation_value_of_preferred_stock_redeemable", 3106L, 0),
  buildings("buildings", 3023L, 0),
  land("land", 3098L, 0),
  lifoReserve("lifo_reserve", 3102L, 0),
  machinery("machinery", 3114L, 0),
  employeesUnderUnionContracts("employees_under_union_contracts", 35123L, 0),
  parttimeEmployees("parttime_employees", 3166L, 0),
  totalEmployees("total_employees", 4371L, 0),
  equityMethodInvestments("equity_method_investments", 3063L, 0),
  finishedGoodsInventory("finished_goods_inventory", 3075L, 0),
  fullTimeEmployees("full_time_employees", 3085L, 0),
  rawMaterialsInventory("raw_materials_inventory", 3171L, 0),
  workInProgressInventory("work_in_progress_inventory", 3219L, 0),
  constructionInProgress("construction_in_progress", 3033L, 0),
  debtEquivalentOperLeases("debt_equivalent_oper_leases", 21671L, 0),
  debtEquivalentOfUnfundedPbo("debt_equivalent_of_unfunded_pbo", 21679L, 0),
  costOfBorrowing("cost_of_borrowing", 21681L, 0),
  accountsReceivables_unbilled("accounts_receivables_unbilled", 45420L, 0),
  periodDateBalanceSheet("period_date_balance_sheet", 1302L, 0),
  filingDateBalanceSheet("filing_date_balance_sheet", 1264L, 0),
  netIncomeCf("net_income_cf", 2150L, 0),
  depreciationAmortCf("depreciation_amort_cf", 2171L, 0),
  amortOfGoodwillAndIntangiblesCf("amort_of_goodwill_and_intangibles_cf", 2182L, 0),
  impairOfOilGasMineralPropCf("impair_of_oil_gas_mineral_prop_cf", 2031L, 0),
  depreciationAmortTotalCf("depreciation_amort_total_cf", 2160L, 0),
  otherAmortization("other_amortization", 2014L, 0),
  otherNoncashItemsTotal("other_noncash_items_total", 2179L, 0),
  minorityIntInEarningsCf("minority_int_in_earnings_cf", 2107L, 0),
  gainLossFromSaleOfAsset("gain_loss_from_sale_of_asset", 2026L, 0),
  gainLossOnSaleOfInvestCf("gain_loss_on_sale_of_invest_cf", 2090L, 0),
  assetWritedownRestructuringCosts("asset_writedown_restructuring_costs", 2019L, 0),
  netIncreaseDecreaseInLoansOrigsold("net_increase_decrease_in_loans_origsold", 2033L, 0),
  provisionForCreditLosses("provision_for_credit_losses", 2112L, 0),
  incomeLossOnEquityInvest("income_loss_on_equity_invest", 2086L, 0),
  stockbasedCompensation("stockbased_compensation", 2127L, 0),
  taxBenefitFromStockOptions("tax_benefit_from_stock_options", 2135L, 0),
  provisionWriteoffOfBadDebts("provision_writeoff_of_bad_debts", 2111L, 0),
  netCashFromDiscontinuedOps("net_cash_from_discontinued_ops", 2081L, 0),
  otherOperatingActivities("other_operating_activities", 2047L, 0),
  changeInNetOperatingAssets("change_in_net_operating_assets", 2010L, 0),
  changeInTradAssetSecurities("change_in_trad_asset_securities", 2134L, 0),
  changeInAccountsReceivable("change_in_accounts_receivable", 2018L, 0),
  changeInInventories("change_in_inventories", 2099L, 0),
  changeInAccPayable("change_in_acc_payable", 2017L, 0),
  changeInUnearnedRev("change_in_unearned_rev", 2139L, 0),
  changeInIncTaxes("change_in_inc_taxes", 2101L, 0),
  changeInDefTaxes("change_in_def_taxes", 2084L, 0),
  changeInOtherNetOperatingAssets("change_in_other_net_operating_assets", 2045L, 0),
  cashFromOps("cash_from_ops", 2006L, 0),
  capitalExpenditure("capital_expenditure", 2021L, 0),
  saleOfPropertyPlantAndEquipment("sale_of_property_plant_and_equipment", 2042L, 0),
  cashAcquisitions("cash_acquisitions", 2057L, 0),
  divestitures("divestitures", 2077L, 0),
  otherInvestingActivitiesTotal("other_investing_activities_total", 2177L, 0),
  salePurchaseOfRealEstateProperties("sale_purchase_of_real_estate_properties", 2040L, 0),
  salePurchaseOfIntangibleAssets("sale_purchase_of_intangible_assets", 2029L, 0),
  investInMarketableEquitySecurt("invest_in_marketable_equity_securt", 2027L, 0),
  netIncDecInLoansOriginatedsold("net_inc_dec_in_loans_originatedsold", 2032L, 0),
  otherInvestingActivities("other_investing_activities", 2051L, 0),
  cashFromInvesting("cash_from_investing", 2005L, 0),
  shortTermDebtIssued("short_term_debt_issued", 2043L, 0),
  longtermDebtIssued("longterm_debt_issued", 2034L, 0),
  totalDebtIssued("total_debt_issued", 2161L, 0),
  shortTermDebtRepaid("short_term_debt_repaid", 2044L, 0),
  longtermDebtRepaid("longterm_debt_repaid", 2036L, 0),
  totalDebtRepaid("total_debt_repaid", 2166L, 0),
  issuanceOfCommonStock("issuance_of_common_stock", 2169L, 0),
  repurchaseOfCommonStock("repurchase_of_common_stock", 2164L, 0),
  issuanceOfPreferredStock("issuance_of_preferred_stock", 2181L, 0),
  repurchaseOfPreferredStock("repurchase_of_preferred_stock", 2172L, 0),
  commonDividendsPaid("common_dividends_paid", 2074L, 0),
  prefDividendsPaid("pref_dividends_paid", 2116L, 0),
  commonAndorPrefDividendsPaid("common_andor_pref_dividends_paid", 2072L, 0),
  totalDividendsPaid("total_dividends_paid", 2022L, 0),
  otherFinancingActivitiesTotal("other_financing_activities_total", 2175L, 0),
  specialDividendPaid("special_dividend_paid", 2041L, 0),
  otherFinancingActivities("other_financing_activities", 2050L, 0),
  cashFromFinancing("cash_from_financing", 2004L, 0),
  foreignExchangeRateAdj("foreign_exchange_rate_adj", 2144L, 0),
  miscCashFlowAdj("misc_cash_flow_adj", 2149L, 0),
  netChangeInCash("net_change_in_cash", 2093L, 0),
  cashInterestPaid("cash_interest_paid", 3028L, 0),
  cashTaxesPaid("cash_taxes_paid", 3053L, 0),
  leveredFreeCashFlow("levered_free_cash_flow", 4422L, 0),
  unleveredFreeCashFlow("unlevered_free_cash_flow", 4423L, 0),
  cashFlowPerShare("cash_flow_per_share", 43923L, 0),
  changeInNetWorkingCapital("change_in_net_working_capital", 4421L, 0),
  netDebtIssued("net_debt_issued", 2003L, 0),
  maintenanceCapex("maintenance_capex", 22985L, 0),
  depreciationOfRentalAssetsCf("depreciation_of_rental_assets_cf", 42409L, 0),
  saleProceedsFromRentalAssets("sale_proceeds_from_rental_assets", 42411L, 0),
  periodDateCashFlow("period_date_cash_flow", 2207L, 0),
  filingDateCashFlow("filing_date_cash_flow", 2155L, 0),
  totalRevenue("total_revenue", 28L, 0),
  revenues("revenues", 112L, 0),
  otherRevenuesTotal("other_revenues_total", 357L, 0),
  financeDivRevenues("finance_div_revenues", 52L, 0),
  insuranceDivRevenues("insurance_div_revenues", 70L, 0),
  gainLossOnSaleOfAssetsRev("gain_loss_on_sale_of_assets_rev", 104L, 0),
  gainLossOnSaleOfInvestRev("gain_loss_on_sale_of_invest_rev", 106L, 0),
  interestAndInvestIncomeRev("interest_and_invest_income_rev", 110L, 0),
  otherRevenues("other_revenues", 90L, 0),
  costOfRevenues("cost_of_revenues", 1L, 0),
  costOfGoodsSold("cost_of_goods_sold", 34L, 0),
  financeDivOperatingExp("finance_div_operating_exp", 51L, 0),
  insuranceDivOperatingExp("insurance_div_operating_exp", 69L, 0),
  interestExpensefinanceDivision("interest_expensefinance_division", 50L, 0),
  grossProfit("gross_profit", 10L, 0),
  sgaExpTotal("sga_exp_total", 23L, 0),
  sellingGeneralAdminExp("selling_general_admin_exp", 102L, 0),
  explorationdrillingCosts("explorationdrilling_costs", 49L, 0),
  provisionForBadDebts("provision_for_bad_debts", 95L, 0),
  stockBasedCompensation("stock_based_compensation", 101L, 0),
  preOpeningCosts("pre_opening_costs", 96L, 0),
  rdExp("rd_exp", 100L, 0),
  depreciationAmortTotal("depreciation_amort_total", 2L, 0),
  depreciationAmort("depreciation_amort", 41L, 0),
  amortOfGoodwillAndIntangibles("amort_of_goodwill_and_intangibles", 31L, 0),
  impairOfOilGasMineralProp("impair_of_oil_gas_mineral_prop", 71L, 0),
  otherOperatingExpenseIncome("other_operating_expense_income", 260L, 0),
  otherOperatingExpTotal("other_operating_exp_total", 380L, 0),
  totalOperatingExpenses("total_operating_expenses", 373L, 0),
  operatingIncome("operating_income", 21L, 0),
  interestExpense("interest_expense", 82L, 0),
  interestAndInvestIncome("interest_and_invest_income", 65L, 0),
  interestAndDividendIncome("interest_and_dividend_income", 210L, 0),
  investmentIncome("investment_income", 46197L, 0),
  netInterestExp("net_interest_exp", 368L, 0),
  otherNonOperatingExpTotal("other_non_operating_exp_total", 371L, 0),
  income_lossFromAffiliates("income_loss_from_affiliates", 47L, 0),
  currencyExchangeGainsLoss("currency_exchange_gains_loss", 38L, 0),
  otherNonOperatingIncExp("other_non_operating_inc_exp", 85L, 0),
  ebtExclUnusualItems("ebt_excl_unusual_items", 4L, 0),
  mergerRestructCharges("merger_restruct_charges", 363L, 0),
  restructuringCharges("restructuring_charges", 98L, 0),
  mergerRelatedRestructCharges("merger_related_restruct_charges", 80L, 0),
  impairmentOfGoodwill("impairment_of_goodwill", 209L, 0),
  gainLossOnSaleOfInvest("gain_loss_on_sale_of_invest", 62L, 0),
  gainLossOnSaleOfAssets("gain_loss_on_sale_of_assets", 56L, 0),
  otherUnusualItemsTotal("other_unusual_items_total", 374L, 0),
  assetWritedown("asset_writedown", 32L, 0),
  inProcessRdExp("in_process_rd_exp", 72L, 0),
  insuranceSettlements("insurance_settlements", 73L, 0),
  legalSettlements("legal_settlements", 77L, 0),
  otherUnusualItems("other_unusual_items", 87L, 0),
  totalUnusualItems("total_unusual_items", 19L, 0),
  ebtInclUnusualItems("ebt_incl_unusual_items", 139L, 0),
  incomeTaxExpense("income_tax_expense", 75L, 0),
  earningsFromContOps("earnings_from_cont_ops", 7L, 0),
  earningsOfDiscontinuedOps("earnings_of_discontinued_ops", 40L, 0),
  extraordItemAccountChange("extraord_item_account_change", 42L, 0),
  otherExpensesIncludingTaxesPrivateOnly("other_expenses_including_taxes_private_only", 0L, 0),
  netIncomeToCompany("net_income_to_company", 41571L, 0),
  minorityIntInEarnings("minority_int_in_earnings", 83L, 0),
  netIncome("net_income", 15L, 0),
  prefDividendsAndOtherAdj("pref_dividends_and_other_adj", 97L, 0),
  niToCommonInclExtraItems("ni_to_common_incl_extra_items", 16L, 0),
  niToCommonExclExtraItems("ni_to_common_excl_extra_items", 379L, 0),
  basicEps("basic_eps", 9L, 0),
  basicEpsExclExtraItems("basic_eps_excl_extra_items", 3064L, 0),
  weightedAvgSharesOutstanding("weighted_avg_shares_outstanding", 3217L, 0),
  dilutedEpsInclExtraItems("diluted_eps_incl_extra_items", 8L, 0),
  dilutedEpsExclExtraItems("diluted_eps_excl_extra_items", 142L, 0),
  weightedAvgDilutedSharesOut("weighted_avg_diluted_shares_out", 342L, 0),
  normalizedBasicEps("normalized_basic_eps", 4379L, 0),
  normalizedDilutedEps("normalized_diluted_eps", 4380L, 0),
  dividendsPerShare("dividends_per_share", 3058L, 0),
  grossDividendsPerShare("gross_dividends_per_share", 45510L, 0),
  netDividendsPerShare("net_dividends_per_share", 45512L, 0),
  specialGrossDividendsPerShare("special_gross_dividends_per_share", 46046L, 0),
  specialNetDividendsPerShare("special_net_dividends_per_share", 46047L, 0),
  corporateTaxRate("corporate_tax_rate", 45514L, 0),
  imputedDividendAmount("imputed_dividend_amount", 45987L, 0),
  imputationPercentage("imputation_percentage", 45999L, 0),
  imputationCreditAmount("imputation_credit_amount", 45993L, 0),
  specialDividendImputedDividendAmount("special_dividend_imputed_dividend_amount", 46005L, 0),
  specialDividendImputationPercentage("special_dividend_imputation_percentage", 46009L, 0),
  specialDividendImputationCreditAmount("special_dividend_imputation_credit_amount", 46007L, 0),
  payoutRatio("payout_ratio", 4377L, 0),
  ebitda("ebitda", 4051L, 0),
  ebita("ebita", 100689L, 0),
  ebit("ebit", 400L, 0),
  ebitdar("ebitdar", 21674L, 0),
  ebitdaInclEquityIncFromAffiliates("ebitda_incl_equity_inc_from_affiliates", 21677L, 0),
  ebitaInclEquityIncFromAffiliates("ebita_incl_equity_inc_from_affiliates", 21676L, 0),
  ebitInclEquityIncFromAffiliates("ebit_incl_equity_inc_from_affiliates", 21675L, 0),
  ebitdarInclEquityIncFromAffiliates("ebitdar_incl_equity_inc_from_affiliates", 24129L, 0),
  ebitdaExclSbcAndInclEquityIncFromAffiliates("ebitda_excl_sbc_and_incl_equity_inc_from_affiliates", 24131L, 0),
  ebitaExclSbcAndInclEquityIncFromAffiliates("ebita_excl_sbc_and_incl_equity_inc_from_affiliates", 24132L, 0),
  ebitExclSbcAndInclEquityIncFromAffiliates("ebit_excl_sbc_and_incl_equity_inc_from_affiliates", 24130L, 0),
  ebitdarExclSbcAndInclEquityIncFromAffiliates("ebitdar_excl_sbc_and_incl_equity_inc_from_affiliates", 24133L, 0),
  ebitdaExclSbc("ebitda_excl_sbc", 24135L, 0),
  ebitaExclSbc("ebita_excl_sbc", 24136L, 0),
  ebitExclSbc("ebit_excl_sbc", 24134L, 0),
  ebitdarExclSbc("ebitdar_excl_sbc", 24137L, 0),
  ebitdacapex("ebitdacapex", 35379L, 0),
  effectiveTaxRate("effective_tax_rate", 4376L, 0),
  normalizedNetIncome("normalized_net_income", 4378L, 0),
  ownedOperatedSameStoreSalesGrowth("owned_operated_same_store_sales_growth", 3195L, 0),
  asReportedTotalRevenue("as_reported_total_revenue", 339L, 0),
  provisionForDoubtfulAccountspatientServiceRevenue("provision_for_doubtful_accountspatient_service_revenue", 45911L,
      0),
  niPerSfas123AfterOptions("ni_per_sfas_123_after_options", 3118L, 0),
  advertisingExpense("advertising_expense", 3013L, 0),
  marketingExpense("marketing_expense", 20776L, 0),
  sellingAndMarketingExpense("selling_and_marketing_expense", 21561L, 0),
  generalAndAdministrativeExpense("general_and_administrative_expense", 21562L, 0),
  rdExpense("rd_expense", 3168L, 0),
  netRentalExpenseTotal("net_rental_expense_total", 3170L, 0),
  minimumRentalExpense("minimum_rental_expense", 20769L, 0),
  depreciationOfRentalAssets("depreciation_of_rental_assets", 42407L, 0),
  revenuesPerShare("revenues_per_share", 4382L, 0),
  totalRevenuesEmployee("total_revenues_employee", 4123L, 0),
  dilutedNetIncome("diluted_net_income", 3522L, 0),
  imputedOperLeaseInterestExp("imputed_oper_lease_interest_exp", 21672L, 0),
  imputedOperLeaseDepreciation("imputed_oper_lease_depreciation", 21673L, 0),
  stockBasedCompCogs("stock_based_comp_cogs", 22674L, 0),
  stockBasedCompRdExp("stock_based_comp_rd_exp", 22678L, 0),
  stockBasedCompSmExp("stock_based_comp_sm_exp", 22680L, 0),
  stockBasedCompGaExp("stock_based_comp_ga_exp", 22675L, 0),
  stockBasedCompSgaExp("stock_based_comp_sga_exp", 22679L, 0),
  stockBasedCompUnallocated("stock_based_comp_unallocated", 22676L, 0),
  stockBasedCompAfterTax("stock_based_comp_after_tax", 22677L, 0),
  stockBasedCompTotal("stock_based_comp_total", 24034L, 0),
  nonCashPensionExpense("non_cash_pension_expense", 21678L, 0),
  distributableCash("distributable_cash", 22984L, 0),
  standardizedDistributableCash("standardized_distributable_cash", 38939L, 0),
  distributableCashPerShare("distributable_cash_per_share", 23317L, 0),
  annualizedDistributionsPerUnit("annualized_distributions_per_unit", 23315L, 0),
  distributableCashPayoutRatioIncomeTrusts("distributable_cash_payout_ratio_income_trusts", 23316L, 0),
  debtIssuanceCosts("debt_issuance_costs", 133L, 0),
  periodDateIncomeStatement("period_date_income_statement", 407L, 0),
  filingDateIncomeStatement("filing_date_income_statement", 349L, 0),
  financialAccountingStandard("financial_accounting_standard", 21680L, 0),
  filingCurrency("filing_currency", 100716L, 0),
  totalAssetTurnover("total_asset_turnover", 4177L, 0),
  fixedAssetTurnover("fixed_asset_turnover", 4066L, 0),
  accountsReceivableTurnover("accounts_receivable_turnover", 4001L, 0),
  inventoryTurnover("inventory_turnover", 4082L, 0),
  currentRatio("current_ratio", 4030L, 0),
  quickRatio("quick_ratio", 4121L, 0),
  avgDaysSalesOut("avg_days_sales_out", 4042L, 0),
  avgDaysInventoryOut("avg_days_inventory_out", 4035L, 0),
  avgDaysPayableOut("avg_days_payable_out", 4183L, 0),
  avgCashConversionCycle("avg_cash_conversion_cycle", 4184L, 0),
  totalRevenues1YrGrowth("total_revenues_1_yr_growth", 4194L, 0),
  grossProfit1YrGrowth("gross_profit_1_yr_growth", 4195L, 0),
  ebitda1YrGrowth("ebitda_1_yr_growth", 4196L, 0),
  ebita1YrGrowth("ebita_1_yr_growth", 4407L, 0),
  ebit1YrGrowth("ebit_1_yr_growth", 4197L, 0),
  earningsFromContOps1YrGrowth("earnings_from_cont_ops_1_yr_growth", 4198L, 0),
  netIncome1YrGrowth("net_income_1_yr_growth", 4199L, 0),
  normalizedNetIncome1YrGrowth("normalized_net_income_1_yr_growth", 4413L, 0),
  dilutedEpsBeforeExtra1YrGrowth("diluted_eps_before_extra_1_yr_growth", 4200L, 0),
  accountsReceivable1YrGrowth("accounts_receivable_1_yr_growth", 4389L, 0),
  inventory1YrGrowth("inventory_1_yr_growth", 4395L, 0),
  netPpe1YrGrowth("net_ppe_1_yr_growth", 4201L, 0),
  commonEquity1YrGrowth("common_equity_1_yr_growth", 4202L, 0),
  totalAssets1YrGrowth("total_assets_1_yr_growth", 4203L, 0),
  tangibleBookValue1YrGrowth("tangible_book_value_1_yr_growth", 4401L, 0),
  cashFromOperations1YrGrowth("cash_from_operations_1_yr_growth", 4204L, 0),
  capitalExpenditures1YrGrowth("capital_expenditures_1_yr_growth", 4205L, 0),
  leveredFreeCashFlow1YrGrowth("levered_free_cash_flow_1_yr_growth", 4424L, 0),
  unleveredFreeCashFlow1YrGrowth("unlevered_free_cash_flow_1_yr_growth", 4430L, 0),
  dividendPerShare1YrGrowth("dividend_per_share_1_yr_growth", 4206L, 0),
  totalRevenues2YrCagr("total_revenues_2_yr_cagr", 4207L, 0),
  grossProfit2YrCagr("gross_profit_2_yr_cagr", 4208L, 0),
  ebitda2YrCagr("ebitda_2_yr_cagr", 4209L, 0),
  ebita2YrCagr("ebita_2_yr_cagr", 4408L, 0),
  ebit2YrCagr("ebit_2_yr_cagr", 4210L, 0),
  earningsFromContOps2YrCagr("earnings_from_cont_ops_2_yr_cagr", 4211L, 0),
  netIncome2YrCagr("net_income_2_yr_cagr", 4212L, 0),
  normalizedNetIncome2YrCagr("normalized_net_income_2_yr_cagr", 4414L, 0),
  dilutedEpsBeforeExtra2YrCagr("diluted_eps_before_extra_2_yr_cagr", 4213L, 0),
  accountsReceivable2YrCagr("accounts_receivable_2_yr_cagr", 4390L, 0),
  inventory2YrCagr("inventory_2_yr_cagr", 4396L, 0),
  netPpe2YrCagr("net_ppe_2_yr_cagr", 4214L, 0),
  commonEquity2YrCagr("common_equity_2_yr_cagr", 4215L, 0),
  totalAssets2YrCagr("total_assets_2_yr_cagr", 4216L, 0),
  tangibleBookValue2YrCagr("tangible_book_value_2_yr_cagr", 4402L, 0),
  cashFromOps2YrCagr("cash_from_ops_2_yr_cagr", 4217L, 0),
  capitalExpenditures2YrCagr("capital_expenditures_2_yr_cagr", 4218L, 0),
  leveredFreeCashFlow2YrCagr("levered_free_cash_flow_2_yr_cagr", 4425L, 0),
  unleveredFreeCashFlow2YrCagr("unlevered_free_cash_flow_2_yr_cagr", 4431L, 0),
  dividendPerShare2YrCagr("dividend_per_share_2_yr_cagr", 4219L, 0),
  totalRevenues3YrCagr("total_revenues_3_yr_cagr", 4220L, 0),
  grossProfit3YrCagr("gross_profit_3_yr_cagr", 4221L, 0),
  ebitda3YrCagr("ebitda_3_yr_cagr", 4222L, 0),
  ebita3YrCagr("ebita_3_yr_cagr", 4409L, 0),
  ebit3YrCagr("ebit_3_yr_cagr", 4223L, 0),
  earningsFromContOps3YrCagr("earnings_from_cont_ops_3_yr_cagr", 4224L, 0),
  netIncome3YrCagr("net_income_3_yr_cagr", 4225L, 0),
  normalizedNetIncome3YrCagr("normalized_net_income_3_yr_cagr", 4415L, 0),
  dilutedEpsBeforeExtra3YrCagr("diluted_eps_before_extra_3_yr_cagr", 4226L, 0),
  accountsReceivable3YrCagr("accounts_receivable_3_yr_cagr", 4391L, 0),
  inventory3YrCagr("inventory_3_yr_cagr", 4397L, 0),
  netPpe3YrCagr("net_ppe_3_yr_cagr", 4227L, 0),
  commonEquity3YrCagr("common_equity_3_yr_cagr", 4228L, 0),
  totalAssets3YrCagr("total_assets_3_yr_cagr", 4229L, 0),
  tangibleBookValue3YrCagr("tangible_book_value_3_yr_cagr", 4403L, 0),
  cashFromOps3YrCagr("cash_from_ops_3_yr_cagr", 4230L, 0),
  capitalExpenditures3YrCagr("capital_expenditures_3_yr_cagr", 4231L, 0),
  leveredFreeCashFlow3YrCagr("levered_free_cash_flow_3_yr_cagr", 4426L, 0),
  unleveredFreeCashFlow3YrCagr("unlevered_free_cash_flow_3_yr_cagr", 4432L, 0),
  dividendPerShare3YrCagr("dividend_per_share_3_yr_cagr", 4232L, 0),
  totalRevenues5YrCagr("total_revenues_5_yr_cagr", 4233L, 0),
  grossProfit5YrCagr("gross_profit_5_yr_cagr", 4234L, 0),
  ebitda5YrCagr("ebitda_5_yr_cagr", 4235L, 0),
  ebita5YrCagr("ebita_5_yr_cagr", 4410L, 0),
  ebit5YrCagr("ebit_5_yr_cagr", 4236L, 0),
  earningsFromContOps5YrCagr("earnings_from_cont_ops_5_yr_cagr", 4237L, 0),
  netIncome5YrCagr("net_income_5_yr_cagr", 4238L, 0),
  normalizedNetIncome5YrCagr("normalized_net_income_5_yr_cagr", 4416L, 0),
  dilutedEpsBeforeExtra5YrCagr("diluted_eps_before_extra_5_yr_cagr", 4239L, 0),
  accountsReceivable5YrCagr("accounts_receivable_5_yr_cagr", 4392L, 0),
  inventory5YrCagr("inventory_5_yr_cagr", 4398L, 0),
  netPpe5YrCagr("net_ppe_5_yr_cagr", 4240L, 0),
  commonEquity5YrCagr("common_equity_5_yr_cagr", 4241L, 0),
  totalAssets5YrCagr("total_assets_5_yr_cagr", 4242L, 0),
  tangibleBookValue5YrCagr("tangible_book_value_5_yr_cagr", 4404L, 0),
  cashFromOps5YrCagr("cash_from_ops_5_yr_cagr", 4243L, 0),
  capitalExpenditures5YrCagr("capital_expenditures_5_yr_cagr", 4244L, 0),
  leveredFreeCashFlow5YrCagr("levered_free_cash_flow_5_yr_cagr", 4427L, 0),
  unleveredFreeCashFlow5YrCagr("unlevered_free_cash_flow_5_yr_cagr", 4433L, 0),
  dividendPerShare5YrCagr("dividend_per_share_5_yr_cagr", 4245L, 0),
  totalRevenues7YrCagr("total_revenues_7_yr_cagr", 4246L, 0),
  grossProfit7YrCagr("gross_profit_7_yr_cagr", 4247L, 0),
  ebitda7YrCagr("ebitda_7_yr_cagr", 4248L, 0),
  ebita7YrCagr("ebita_7_yr_cagr", 4411L, 0),
  ebit7YrCagr("ebit_7_yr_cagr", 4249L, 0),
  earningsFromContOps7YrCagr("earnings_from_cont_ops_7_yr_cagr", 4250L, 0),
  netIncome7YrCagr("net_income_7_yr_cagr", 4251L, 0),
  normalizedNetIncome7YrCagr("normalized_net_income_7_yr_cagr", 4417L, 0),
  dilutedEpsBeforeExtra7YrCagr("diluted_eps_before_extra_7_yr_cagr", 4252L, 0),
  accountsReceivable7YrCagr("accounts_receivable_7_yr_cagr", 4393L, 0),
  inventory7YrCagr("inventory_7_yr_cagr", 4399L, 0),
  netPpe7YrCagr("net_ppe_7_yr_cagr", 4253L, 0),
  commonEquity7YrCagr("common_equity_7_yr_cagr", 4254L, 0),
  totalAssets7YrCagr("total_assets_7_yr_cagr", 4255L, 0),
  tangibleBookValue7YrCagr("tangible_book_value_7_yr_cagr", 4405L, 0),
  cashFromOps7YrCagr("cash_from_ops_7_yr_cagr", 4256L, 0),
  capitalExpenditures7YrCagr("capital_expenditures_7_yr_cagr", 4257L, 0),
  leveredFreeCashFlow7YrCagr("levered_free_cash_flow_7_yr_cagr", 4428L, 0),
  unleveredFreeCashFlow7YrCagr("unlevered_free_cash_flow_7_yr_cagr", 4434L, 0),
  dividendPerShare7YrCagr("dividend_per_share_7_yr_cagr", 4258L, 0),
  totalRevenues10YrCagr("total_revenues_10_yr_cagr", 4259L, 0),
  grossProfit10YrCagr("gross_profit_10_yr_cagr", 4260L, 0),
  ebitda10YrCagr("ebitda_10_yr_cagr", 4261L, 0),
  ebita10YrCagr("ebita_10_yr_cagr", 4412L, 0),
  ebit10YrCagr("ebit_10_yr_cagr", 4262L, 0),
  earningsFromContOps10YrCagr("earnings_from_cont_ops_10_yr_cagr", 4263L, 0),
  netIncome10YrCagr("net_income_10_yr_cagr", 4264L, 0),
  normalizedNetIncome10YrCagr("normalized_net_income_10_yr_cagr", 4418L, 0),
  dilutedEpsBeforeExtra10YrCagr("diluted_eps_before_extra_10_yr_cagr", 4265L, 0),
  accountsReceivable10YrCagr("accounts_receivable_10_yr_cagr", 4394L, 0),
  inventory10YrCagr("inventory_10_yr_cagr", 4400L, 0),
  netPpe10YrCagr("net_ppe_10_yr_cagr", 4266L, 0),
  commonEquity10YrCagr("common_equity_10_yr_cagr", 4267L, 0),
  totalAssets10YrCagr("total_assets_10_yr_cagr", 4268L, 0),
  tangibleBookValue10YrCagr("tangible_book_value_10_yr_cagr", 4406L, 0),
  cashFromOps10YrCagr("cash_from_ops_10_yr_cagr", 4269L, 0),
  capitalExpenditures10YrCagr("capital_expenditures_10_yr_cagr", 4270L, 0),
  leveredFreeCashFlow10YrCagr("levered_free_cash_flow_10_yr_cagr", 4429L, 0),
  unleveredFreeCashFlow10YrCagr("unlevered_free_cash_flow_10_yr_cagr", 4435L, 0),
  dividendPerShare10YrCagr("dividend_per_share_10_yr_cagr", 4271L, 0),
  cashFromOpsToCurrLiab("cash_from_ops_to_curr_liab", 4185L, 0),
  totalDebtToEquity("total_debt_to_equity", 4034L, 0),
  totalDebtToCapital("total_debt_to_capital", 4186L, 0),
  ltDebtToEquity("lt_debt_to_equity", 4085L, 0),
  ltDebtToCapital("lt_debt_to_capital", 4187L, 0),
  totalLiabilitiesToTotalAssets("total_liabilities_to_total_assets", 4188L, 0),
  ebitToInterestExp("ebit_to_interest_exp", 4189L, 0),
  ebitdaToInterestExp("ebitda_to_interest_exp", 4190L, 0),
  ebitdaCapexToInterestExp("ebitda_capex_to_interest_exp", 4191L, 0),
  totalDebtToEbitda("total_debt_to_ebitda", 4192L, 0),
  netDebtToEbitda("net_debt_to_ebitda", 4193L, 0),
  totalDebtToEbitdaCapex("total_debt_to_ebitda_capex", 23313L, 0),
  netDebtToEbitdaCapex("net_debt_to_ebitda_capex", 23314L, 0),
  capexAsOfRevenues("capex_as_of_revenues", 35380L, 0),
  altmanZScore("altman_z_score", 100123L, 0),
  returnOnAssets("return_on_assets", 4178L, 0),
  returnOnCapital("return_on_capital", 4363L, 0),
  returnOnEquity("return_on_equity", 4128L, 0),
  returnOnCommonEquity("return_on_common_equity", 33320L, 0),
  grossMargin("gross_margin", 4074L, 0),
  ebitdaMargin("ebitda_margin", 4047L, 0),
  ebitaMargin("ebita_margin", 4419L, 0),
  ebitMargin("ebit_margin", 4053L, 0),
  sgaMargin("sga_margin", 4375L, 0),
  earningsFromContOpsMargin("earnings_from_cont_ops_margin", 4181L, 0),
  netIncomeMargin("net_income_margin", 4094L, 0),
  netIncAvailForCommonMargin("net_inc_avail_for_common_margin", 4182L, 0),
  leveredFreeCashFlowMargin("levered_free_cash_flow_margin", 4436L, 0),
  unleveredFreeCashFlowMargin("unlevered_free_cash_flow_margin", 4437L, 0),
  normalizedNetIncomeMargin("normalized_net_income_margin", 4420L, 0),
  floatPrecent("float_precent", 4170L, 0);

  private String field;
  private long dataItemId;
  private int type; // 0为数字类型  1为文字类型

  public static final int VALUE_TYPE = 0;
  public static final int TEXT_TYPE = 1;

  FinancialReportField(String field, long dataItemId, int type) {
    this.field = field;
    this.dataItemId = dataItemId;
    this.type = type;
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public long getDataItemId() {
    return dataItemId;
  }

  public void setDataItemId(long dataItemId) {
    this.dataItemId = dataItemId;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }
}
