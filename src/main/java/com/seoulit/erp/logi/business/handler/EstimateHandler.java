package com.seoulit.erp.logi.business.handler;

import com.seoulit.erp.logi.business.service.BusinessServiceFacade;
import com.seoulit.erp.logi.business.to.EstimateDetailTo;
import com.seoulit.erp.logi.business.to.EstimateTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/logi/business/*")
public class EstimateHandler {
	
	@Autowired
	BusinessServiceFacade businessServiceFacade;
	
	//searchDate = fromDate, toDate
	@RequestMapping("/findEstimateList")
	public List<EstimateTo> findEstimateList(@RequestBody Map<String, Object> searchDate){
		
		return businessServiceFacade.findEstimateList(searchDate);
	}
	
	//findDestimateDetailList를 만들어야 하는지는 뷰단 보고 하자
	
	//regist - 견적은 하나만 등록
	@RequestMapping("/registEstimate")
	public void registEstimate(@RequestBody EstimateTo estiamteTo) {
		System.out.println("getEstimateNo   :"+estiamteTo.getEstimateNo());
		businessServiceFacade.registEstimate(estiamteTo);
	}
	
	//batchEstimate - 견적상세 여러개 등록  
	//일괄 저장으로 견적상세 등록 처리
	@RequestMapping("/batchEstimate")
	public void batchEstimate(@RequestBody List<EstimateDetailTo> estimateDetailList
							  ) {
		System.out.println("EstimateDetailTo :"+estimateDetailList.toString());
		System.out.println("getEstimateDetailNo :"+estimateDetailList.get(0).getEstimateDetailNo());
		businessServiceFacade.batchEstimate(estimateDetailList);

	}
}
