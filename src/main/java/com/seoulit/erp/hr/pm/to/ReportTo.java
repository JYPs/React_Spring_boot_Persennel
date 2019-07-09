package com.seoulit.erp.hr.pm.to;


import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("ReportTo")
public class ReportTo extends BaseTo{

	private String empCode;
	private String empName;
	private String positionName;
	private String deptName;
	private String detailCodeName;
	private String baseAddress;
	private String detailAddress;
	private String hireDate;
}
