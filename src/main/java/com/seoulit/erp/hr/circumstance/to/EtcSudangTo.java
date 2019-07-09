package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("EtcSudangTo")
@Getter
@Setter
public class EtcSudangTo extends BaseTo{
	private String etcSalCode;
	private String etcSalName;
	private String etcSalPrice;
}
