package com.seoulit.erp.hr.attendance.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@Alias("OverNightReportTo")
public class OverNightReportTo extends BaseTo {
	private String overNightSeq;
	private String basicDay;
	private String empCode;
	private String empName;
	private String approvalStatus;
	private String requestStatus;
	private String type;
	private String requestDate;
	private String fromTime;
	private String toTime;

}
