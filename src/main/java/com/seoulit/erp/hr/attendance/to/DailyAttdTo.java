package com.seoulit.erp.hr.attendance.to;


import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("DailyAttdTo")
public class DailyAttdTo extends BaseTo {

	private String empCode;
	private String empName;
	private String dayAttdSeq;
	private String basicDay;
	private String attdTypeCode;
	private String time;
	private String approvalStatus;
	private String cost;
	private String cause;

}
