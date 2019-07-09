package com.seoulit.erp.hr.circumstance.to;

import java.util.List;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("SudangInfoTo")
@Getter
@Setter
public class SudangInfoTo extends BaseTo {
	private List<OvertimeSudangTo> overtimeSalList;
	private List<EtcSudangTo> etcSalList;
}
