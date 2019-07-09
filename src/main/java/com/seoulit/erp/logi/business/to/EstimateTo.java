package com.seoulit.erp.logi.business.to;

import java.util.List;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("EstimateTo")
public class EstimateTo extends BaseTo{

	private String estimateNo, customerCode, estimateDate, 
					contractStatus, estimateRequester, effectiveDate, 
					personCodeInCharge, description;

	List<EstimateDetailTo> estimateDetailList;
	
	public List<EstimateDetailTo> getEstimateDetailList() {
		return estimateDetailList;
	}

	public void setEstimateDetailList(List<EstimateDetailTo> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}

	public String getEstimateNo() {
		return estimateNo;
	}

	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getEstimateDate() {
		return estimateDate;
	}

	public void setEstimateDate(String estimateDate) {
		this.estimateDate = estimateDate;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getEstimateRequester() {
		return estimateRequester;
	}

	public void setEstimateRequester(String estimateRequester) {
		this.estimateRequester = estimateRequester;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPersonCodeInCharge() {
		return personCodeInCharge;
	}

	public void setPersonCodeInCharge(String personCodeInCharge) {
		this.personCodeInCharge = personCodeInCharge;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
