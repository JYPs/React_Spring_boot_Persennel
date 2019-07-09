package com.seoulit.erp.hr.circumstance.service;

import com.seoulit.erp.hr.circumstance.to.*;

import java.util.List;
import java.util.Map;

public interface CircumstanceServiceFacade {

	//------------- AnnualLeave ---------------------
	List<AnnualLeaveTo> findAnnualLeaveList();
	
	void registAnnualLeave(Map<String, String> map);
	
	void batchAnnualLeave(AnnualLeaveTo annualLeaveTo);
	
	//------------- BaseWorkTime --------------------
	BaseWorkTimeTo findBaseWorkTime(String applyYear);
	
	void registBaseWorkTime(BaseWorkTimeTo baseWorkTimeTo);
	
	void batchBaseWorkTime(List<BaseWorkTimeTo> baseWorkTimeList);
	
	//------------- DeductionInsurance -----------------------------
	List<DeductionTaxTo> findDeductionTaxList(String year);
	
	List<IncomeTaxTo> findIncomeTaxList(String year);
	
	void batchDeductionTax(DeductionTaxTo deductionTaxTo);
	void batchIncomeTax(IncomeTaxTo incomeTaxTo);
	
	
	//----------------- Holiday ---------------
	List<HolidayTo> findHolidayList(String fromDate, String toDate);
	
	void batchHoliday(List<HolidayTo> holidayToList);

	//---------------- PayDeduction -------------
	List<PayDeductionItemTo> findPayDeductionList(Map<String, String> data);
	
	void batchPayDeduction(List<PayDeductionItemTo> payDeductionItemList);
	
	//------------- sudang --------------------
	Map<String,Object> findSudangList();
	void batchSudangProcess(Map<String, Object> sudangInfoList);

	//------------- 호봉 관리 --------------------
	List<PayStepTo> findPayStepList(String positionCode);

	void batchPayStepList(List<PayStepTo> payStepList);


	//------------- 급여 상여 지급 일자--------------------
	List<SalPaymentDateTo> findSalPaymentDateList(String inputedYearMonth);
	void batchSalPaymentDate(List<SalPaymentDateTo> salPaymentDateList);

	EmpAnnualDataTo findEmpAnnualData(String empCode);
}
