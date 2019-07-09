package com.seoulit.erp.logi.business.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seoulit.erp.logi.business.service.BusinessServiceFacade;
import com.seoulit.erp.logi.business.to.DeliveryResultTo;

@RestController
@RequestMapping("/logi/business/*")
public class DeliveryResultJHandler {
	
	@Autowired
	BusinessServiceFacade businessServiceFacade;
	
	@RequestMapping("/findDeliveryResultList")
	public List<DeliveryResultTo> findDeliveryResultList(){
		return businessServiceFacade.findDeliveryResultList();
	}
	
	//납품 정보 등록만 등록  --> 이후에 stock 조정, status도??
	//납품 정보 등록하면 바로 납품이 된다는 의미인듯
	@RequestMapping("/registDeliveryResult")
	public void registDeliveryResult(@RequestBody List<DeliveryResultTo> deliveryResult) {
		businessServiceFacade.registDeliveryResult(deliveryResult);
	}
}
