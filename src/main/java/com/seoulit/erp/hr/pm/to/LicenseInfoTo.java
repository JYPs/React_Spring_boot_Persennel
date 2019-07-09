package com.seoulit.erp.hr.pm.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("LicenseInfoTo")
public class LicenseInfoTo extends BaseTo{

	private String empCode;
	private String licenseSeq;
	private String licenseName;
	private String startDate;
	private String endDate;
	private String licenseCenter;
	private String licenseLevel;
	private String licenseNo;
}
