package com.seoulit.erp.logi.business.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.seoulit.erp.logi.business.to.ContractTo;

@Mapper
public interface ContractDao {
	
	public List<ContractTo> selectContractList(Map<String, Object> searchDate);
	
	public void insertContract(ContractTo contractTo);

}
