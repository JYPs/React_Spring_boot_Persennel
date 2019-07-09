package com.seoulit.erp.logi.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.seoulit.erp.logi.business.to.EstimateDetailTo;

@Mapper
public interface EstimateDetailDao {

	public List<EstimateDetailDao> selectEstimateDetailList();
	
	public void insertEstimateDetail(EstimateDetailTo estimateDatailTo);
	public void updateEstimateDetail(EstimateDetailTo estimateDatailTo);
	public void deleteEstimateDetail(EstimateDetailTo estimateDatailTo);
}
