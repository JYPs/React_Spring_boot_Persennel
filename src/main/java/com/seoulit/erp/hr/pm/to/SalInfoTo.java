package com.seoulit.erp.hr.pm.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("SalInfoTo")
public class SalInfoTo extends BaseTo{
	
	private String empCode;
	private String hobong;
	private String salaryTypeCode;
	private String pensionType;
	private String nationalPension;
	private String healthInsurance;
	private String employeementInsurance;
	private String longTermCareInsurance;
	private String supportTwentyBelow;
	private String supportSixtyAbove;
	private String manyChildDeduction;
	private String accountCode;
	private String accountHolder;
	private String salTransBank;

}
