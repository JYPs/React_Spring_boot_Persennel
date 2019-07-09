package com.seoulit.erp.sys.service;

import com.seoulit.erp.sys.exception.IdNotFoundException;
import com.seoulit.erp.sys.exception.PwMissMatchException;
import com.seoulit.erp.sys.to.*;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

public interface BaseServiceFacade {

	List<MenuTo> findMenuList();
	
	String login(LoginTo loginTo) throws DataAccessException, IdNotFoundException, PwMissMatchException;
	
	List<CodeTo> findCodeList();
	List<CodeDetailTo> findCodeDetailList();
	List<CodeDetailTo> findPayStepCodeDetailList(String divisionCode);
	
	List<AuthorityTo> findAuthorityList();
	
	List<AuthorityTo> findMenuAuthorityList(Map<String, Object> data);

	<T> void batchDetailCodeProcess(T bean, Map<String, Object> codeColumn);
	void batchDetailCodeProcess(List<CodeDetailTo> codeDetailList);
	// DetailCode 변경저장

}
