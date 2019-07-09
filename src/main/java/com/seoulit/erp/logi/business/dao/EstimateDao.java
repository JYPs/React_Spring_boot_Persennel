package com.seoulit.erp.logi.business.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.seoulit.erp.logi.business.to.EstimateTo;

@Mapper
public interface EstimateDao {

	public List<EstimateTo> selectEstimateList(Map<String, Object> searchDate);
	
	public void insertEstimate(EstimateTo estimateTo);
	//public void updateEstimate(EstimateTo estimateTo);
	//public void deleteEstimate(EstimateTo estimateTo);
}
