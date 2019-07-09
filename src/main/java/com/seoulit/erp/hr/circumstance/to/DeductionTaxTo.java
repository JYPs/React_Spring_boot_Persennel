package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("DeductionTaxTo")
@Getter
@Setter
public class DeductionTaxTo extends BaseTo {
	private String inputedYear;
	private String healthInsurRate;
	private String nationalPenRate;
	private String longTermCareRate;
	private String employeementInsurRate;
}
