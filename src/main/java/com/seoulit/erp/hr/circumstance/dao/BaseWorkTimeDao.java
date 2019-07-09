package com.seoulit.erp.hr.circumstance.dao;

import org.apache.ibatis.annotations.Mapper;

import com.seoulit.erp.hr.circumstance.to.BaseWorkTimeTo;

@Mapper
public interface BaseWorkTimeDao {

	public BaseWorkTimeTo selectBaseWorkTime(String applyYear);
	
	public void insertBaseWorkTime(BaseWorkTimeTo baseWorkTimeTo);
	
	public void updateBaseWorkTime(BaseWorkTimeTo baseWorkTimeTo);
	
	public void deleteBaseWorkTime(BaseWorkTimeTo baseWorkTimeTo);
}
