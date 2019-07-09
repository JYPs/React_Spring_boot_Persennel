package com.seoulit.erp.logi.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoulit.erp.logi.business.dao.ContractDao;
import com.seoulit.erp.logi.business.dao.ContractDetailDao;
import com.seoulit.erp.logi.business.dao.DeliveryResultDao;
import com.seoulit.erp.logi.business.dao.EstimateDao;
import com.seoulit.erp.logi.business.dao.EstimateDetailDao;
import com.seoulit.erp.logi.business.to.ContractDetailTo;
import com.seoulit.erp.logi.business.to.ContractTo;
import com.seoulit.erp.logi.business.to.DeliveryResultTo;
import com.seoulit.erp.logi.business.to.EstimateDetailTo;
import com.seoulit.erp.logi.business.to.EstimateTo;

@Service
public class BusinessServiceFacadeImpl implements BusinessServiceFacade {
	
	@Autowired
	ContractDao contractDao;
	@Autowired
	EstimateDao estimateDao;
	@Autowired
	EstimateDetailDao estimateDetailDao;
	@Autowired
	ContractDetailDao contractDetailDao;
	@Autowired
	DeliveryResultDao deliveryResultDao;

	// ============= Contract ==============
	@Override
	public List<ContractTo> findContractList(Map<String, Object> searchDate) {

		return contractDao.selectContractList(searchDate);
	}

	@Override
	public List<ContractDetailTo> findContractDetailList(String contractNo) {
		return contractDetailDao.selectContractDetailList(contractNo);
	}

	@Override
	public void registContract(ContractTo contractTo) {
		if (contractTo != null) {
			switch (contractTo.getStatus()) {
			case "inserted":
				contractDao.insertContract(contractTo);
				break;
			}
		}
	}

	@Override
	public void batchContract(List<ContractDetailTo> contractDetailList) {
		if (contractDetailList != null) {
			for (ContractDetailTo contractDetailTo : contractDetailList) {
				switch (contractDetailTo.getStatus()) {
				case "inserted":
					contractDetailDao.insertContractDetail(contractDetailTo);
					break;
				case "updated":
					contractDetailDao.updateContractDetail(contractDetailTo);
					break;
				case "deleted":
					contractDetailDao.deleteContractDetail(contractDetailTo);
					break;
				}
			}
		}
	}

	// ============= Estimate ==============
	@Override
	public List<EstimateTo> findEstimateList(Map<String, Object> searchDate) {

		return estimateDao.selectEstimateList(searchDate);
	}

	@Override
	public void registEstimate(EstimateTo estimateTo) {
		if (estimateTo != null) {
			switch (estimateTo.getStatus()) {
			case "inserted":
				estimateDao.insertEstimate(estimateTo);
				break;
			}
		}
	}

	@Override
	public void batchEstimate(List<EstimateDetailTo> estimateDetailList) {
		System.out.println(estimateDetailList.get(0).getEstimateDetailNo());
		System.out.println(estimateDetailList.get(0).getStatus());

		if (estimateDetailList != null) {
			for (EstimateDetailTo estimateDetailTo : estimateDetailList) {
				switch (estimateDetailTo.getStatus()) {
				case "inserted":
					estimateDetailDao.insertEstimateDetail(estimateDetailTo);
					break;
				case "updated":
					estimateDetailDao.updateEstimateDetail(estimateDetailTo);
					break;
				case "deleted":
					estimateDetailDao.deleteEstimateDetail(estimateDetailTo);
					break;
				}
			}
		}
	}

	// ============= Delivery ==============
	@Override
	public List<DeliveryResultTo> findDeliveryResultList() {
		return deliveryResultDao.selectDeliveryResult();
	}

	@Override
	public void registDeliveryResult(List<DeliveryResultTo> deliveryResultList) {
		for(DeliveryResultTo deliveryResultTo :  deliveryResultList) {
			if(deliveryResultTo.getStatus().equals("inserted")) {
				deliveryResultDao.insertDeliveryResult(deliveryResultTo);
			}
		}
	}

}
