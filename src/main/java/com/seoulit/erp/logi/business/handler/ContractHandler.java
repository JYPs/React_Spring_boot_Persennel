package com.seoulit.erp.logi.business.handler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seoulit.erp.logi.business.service.BusinessServiceFacade;
import com.seoulit.erp.logi.business.to.ContractDetailTo;
import com.seoulit.erp.logi.business.to.ContractTo;


@RestController
@RequestMapping("/logi/business/*")
public class ContractHandler {
	
	@Autowired
	BusinessServiceFacade businessServiceFacade;
	
	@CrossOrigin("*")
	//serchDate = fromDate, toDate ,POST
	@RequestMapping("/findContractList")
	public List<ContractTo> findContractList(@RequestBody Map<String, Object> searchDate){
		return businessServiceFacade.findContractList(searchDate);
	}
	
	//수주 번호 넘겨서 수주상세List 조회 , GET
	@RequestMapping("/findContractDetailList")
	public List<ContractDetailTo> findContractDetailList(String contractNo){
		return businessServiceFacade.findContractDetailList(contractNo);
	}
	
	//수주 하나 등록
	@RequestMapping("/registContract")
	public void registContract(@RequestBody ContractTo contractTo) {
		businessServiceFacade.registContract(contractTo);
	}

	//수주상세 등록
	@RequestMapping("/batchContract")
	public void batchContract(@RequestBody List<ContractDetailTo> contractDetailList) {
		businessServiceFacade.batchContract(contractDetailList);
	}
}
