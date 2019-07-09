package com.seoulit.erp.logi.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.seoulit.erp.logi.business.to.DeliveryResultTo;

@Mapper
public interface DeliveryResultDao {

	public List<DeliveryResultTo> selectDeliveryResult();
	
	public void insertDeliveryResult(DeliveryResultTo deliveryResultTo);
}
