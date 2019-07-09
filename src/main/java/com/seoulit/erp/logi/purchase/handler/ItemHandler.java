package com.seoulit.erp.logi.purchase.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seoulit.erp.logi.purchase.service.PurchaseServiceFacade;
import com.seoulit.erp.logi.purchase.to.ItemTo;

@RestController
@RequestMapping("logi/purchase/*")
public class ItemHandler {
	
	@Autowired 
	private PurchaseServiceFacade purchaseServiceFacade;
	
	//품목조회
	@RequestMapping("findItemList")
	public List<ItemTo> findItemList() {
		return purchaseServiceFacade.findItemList();
	}
	
	//품목일괄저장
	@RequestMapping("logi/purchase/batchItem")
	public void batchItem(@RequestBody List<ItemTo> itemList) {
		purchaseServiceFacade.batchItem(itemList);
	}
	
}
