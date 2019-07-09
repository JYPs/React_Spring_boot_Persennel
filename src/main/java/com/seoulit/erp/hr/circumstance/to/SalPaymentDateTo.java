package com.seoulit.erp.hr.circumstance.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Alias("SalPaymentDateTo")
@Setter
@Getter
public class SalPaymentDateTo extends BaseTo {
	private String paymentDate;
	private String inputedYearMonth;
	private String jikjongCode;
	private String targetChoice;
	private String sameTimeSelection;
	private String payType;
	private String salaryTypeCode;
	private String note;
	private String slipRegistStatus;
}
