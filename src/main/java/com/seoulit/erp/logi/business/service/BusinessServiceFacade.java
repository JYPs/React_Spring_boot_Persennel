package com.seoulit.erp.logi.business.service;


import java.util.List;
import java.util.Map;

import com.seoulit.erp.logi.business.to.ContractDetailTo;
import com.seoulit.erp.logi.business.to.ContractTo;
import com.seoulit.erp.logi.business.to.DeliveryResultTo;
import com.seoulit.erp.logi.business.to.EstimateDetailTo;
import com.seoulit.erp.logi.business.to.EstimateTo;

public interface BusinessServiceFacade {

	//=============== Contract ======================
	public List<ContractTo> findContractList(Map<String, Object> searchDate);
	
	public List<ContractDetailTo> findContractDetailList(String contractNo);
	
	public void registContract(ContractTo contractTo);
	public void batchContract(List<ContractDetailTo> contractDetailList);
	
	//=============== Estimate ======================
	public List<EstimateTo> findEstimateList(Map<String, Object> searchDate);
	
	public void registEstimate(EstimateTo estimateTo);
	public void batchEstimate(List<EstimateDetailTo> estimateDetailList);
	
	//=============== Delivery ======================
	public List<DeliveryResultTo> findDeliveryResultList();

	public void registDeliveryResult(List<DeliveryResultTo> deliveryResult);
}


