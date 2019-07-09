package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("OvertimeSudangTo")
@Getter
@Setter
public class OvertimeSudangTo extends BaseTo{
	private String overtimeSalCode;
	private String overtimeSalName;
	private String overtimeSalRate;
}
