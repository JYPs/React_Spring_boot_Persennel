package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("BaseWorkTimeTo")
@Getter
@Setter
public class BaseWorkTimeTo extends BaseTo{
	private String applyYear;
	private String attendTime;
	private String quitTime;
	private String lunchStartTime;
	private String lunchEndTime;
	private String overTime;
	private String nightTime;
	private String dinnerStartTime;
	private String dinnerEndTime;
}
