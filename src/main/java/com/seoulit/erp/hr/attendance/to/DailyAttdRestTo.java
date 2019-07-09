package com.seoulit.erp.hr.attendance.to;


import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;
import com.seoulit.common.to.BaseTo;
@Getter
@Setter
@Alias("DailyAttdRestTo")
public class DailyAttdRestTo extends BaseTo{
	
	private String empCode;
	private String attdRestSeq;
	private String attdRestCode;
	private String requestDate;
	private String startDate;
	private String endDate;
	private String days;
	private String cost;
	private String cause;
	private String approvalStatus;
	private String empName;
	private String otherSudang;

}
