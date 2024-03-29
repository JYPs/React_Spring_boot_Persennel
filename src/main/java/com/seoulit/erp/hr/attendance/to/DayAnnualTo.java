package com.seoulit.erp.hr.attendance.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("DayAnnualTo")
public class DayAnnualTo extends BaseTo{

	private String dayAnnualSeq;
	private String empCode;
	private String startDate;
	private String endDate;
	private String causeCode;
	private String detailCause;
	private String standardYear;
	private String annualCode;
	private String days;
	private String empName;
	private String approvalStatus;
	

}

