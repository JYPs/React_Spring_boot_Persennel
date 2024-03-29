package com.seoulit.erp.sys.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seoulit.erp.sys.service.BaseServiceFacade;
import com.seoulit.erp.sys.to.MenuTo;

@RestController
public class MenuHandler {

	@Autowired
	BaseServiceFacade baseServiceFacade;
	
	@CrossOrigin(value = "*", allowedHeaders = "Authorization", exposedHeaders = "Authorization")
	@RequestMapping("/sys/findMenuList")
	public List<MenuTo> findMenuList(){
		return baseServiceFacade.findMenuList();
	};
}
