package com.seoulit.erp.hr.pm.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("FamilyInfoTo")
public class FamilyInfoTo extends BaseTo{

	private String empCode;
	private String familySeq;
	private String familyName;
	private String familyBirthDate;
	private String relationship;
	private String supporting;
	private String cohabitationStatus;
	private String disabilityCode;
	private String highestEducationCode;
	private String job;
	private String companyName;
	private String tel;

}
