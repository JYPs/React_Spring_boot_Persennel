package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("AnnualLeaveTo")
@Setter
@Getter
public class AnnualLeaveTo extends BaseTo{
	private String empCode;
	private String standardYear;
	private String restDays;
	private String usableDays;
	private String usedDays;
	private String lengthOfService;
}
