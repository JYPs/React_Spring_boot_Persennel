package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("PayStepTo")
@Setter
@Getter
public class PayStepTo extends BaseTo{
	String hobong;
	String positionCode;
	String baseSal;
	String bonus;
	String sigub;
}
