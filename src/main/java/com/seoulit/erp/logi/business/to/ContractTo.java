package com.seoulit.erp.logi.business.to;

import java.util.List;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("ContractTo")
public class ContractTo extends BaseTo{

	private String contractNo, estimateNo, contractType, 
	customerCode, contractDate, contractRequester,personCodeInCharge, description, deliveryResultStatus,
	slipRegistStatus;
	
	List<ContractDetailTo> contractDetailList;
	
	public List<ContractDetailTo> getContractDetailList() {
		return contractDetailList;
	}

	public void setContractDetailList(List<ContractDetailTo> contractDetailList) {
		this.contractDetailList = contractDetailList;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getEstimateNo() {
		return estimateNo;
	}

	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getContractDate() {
		return contractDate;
	}

	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	public String getContractRequester() {
		return contractRequester;
	}

	public void setContractRequester(String contractRequester) {
		this.contractRequester = contractRequester;
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

	public String getDeliveryResultStatus() {
		return deliveryResultStatus;
	}

	public void setDeliveryResultStatus(String deliveryResultStatus) {
		this.deliveryResultStatus = deliveryResultStatus;
	}

	public String getSlipRegistStatus() {
		return slipRegistStatus;
	}

	public void setSlipRegistStatus(String slipRegistStatus) {
		this.slipRegistStatus = slipRegistStatus;
	}
	
}
