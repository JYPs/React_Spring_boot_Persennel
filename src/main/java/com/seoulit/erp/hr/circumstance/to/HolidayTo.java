package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("HolidayTo")
@Getter
@Setter
public class HolidayTo extends BaseTo{
	private String basicDay;
	private String holidayName;
	private String note;
	private String holidayType;
}
