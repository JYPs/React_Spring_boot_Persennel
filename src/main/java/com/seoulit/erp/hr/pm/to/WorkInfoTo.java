package com.seoulit.erp.hr.pm.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("WorkInfoTo")
public class WorkInfoTo extends BaseTo {

	private String hireDate;
	private String retireDate;
	private String employeementTypeCode;
	private String retireCause;
	private String probationStatus;
	private String probationExpireDate;
	private String projectCode;
	private String jikjongCode;
	private String empCode;
	private String empName;

}
