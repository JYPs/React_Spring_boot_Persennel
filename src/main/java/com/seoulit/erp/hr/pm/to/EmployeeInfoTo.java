package com.seoulit.erp.hr.pm.to;

import java.util.List;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Alias("EmployeeInfoTo")
public class EmployeeInfoTo extends BaseTo {

	private List<EmpInfoTo> empInfoList;

	private List<WorkInfoTo> workInfoList;

	private List<FamilyInfoTo> familyInfoList;

	private List<LicenseInfoTo> licenseInfoList;

	private List<EducationInfoTo> educationInfoList;

	// private List<SalInfoTo> salInfoList;

}
