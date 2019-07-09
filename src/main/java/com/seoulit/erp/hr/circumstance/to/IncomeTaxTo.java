package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("IncomeTaxTo")
@Getter
@Setter
public class IncomeTaxTo extends BaseTo{
	private String incomeTaxRate;
	private String inputedYear;
	private String lowSal;
	private String highSal;
	private String progressiveDeduction;
}
