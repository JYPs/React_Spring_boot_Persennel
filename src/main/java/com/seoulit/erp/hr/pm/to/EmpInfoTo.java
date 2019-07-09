package com.seoulit.erp.hr.pm.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("EmpInfoTo")
public class EmpInfoTo extends BaseTo{
	
	private String chk;
	private String empCode;
	private String empName;
	private String residentNumber;
	private String birthDate;
	private String gender;
	private String imgSrc;
	private String zipCode;
	private String baseAddress;
	private String detailAddress;
	private String email;
	private String tel;
	private String phoneNumber;
	private String highestEducationCode;
	private String nativeTypeCode;
	private String disabilityCode;
	
}
