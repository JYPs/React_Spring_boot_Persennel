package com.seoulit.erp.logi.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.seoulit.erp.logi.business.to.ContractDetailTo;

@Mapper
public interface ContractDetailDao {

	public List<ContractDetailTo> selectContractDetailList(String contractNo);
	
	public void insertContractDetail(ContractDetailTo contractDetailTo);
	public void updateContractDetail(ContractDetailTo contractDetailTo);
	public void deleteContractDetail(ContractDetailTo contractDetailTo);
}
