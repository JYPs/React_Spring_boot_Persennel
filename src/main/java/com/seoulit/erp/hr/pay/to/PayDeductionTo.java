package com.seoulit.erp.hr.pay.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("PayDeductionTo")
public class PayDeductionTo extends BaseTo{

	private String payDeductionSeq;
	private String price;
	private String payDeductionItemCode;
	private String payDeductionItemName;
	private String empCode;
	private String paymentDate;
	private String payDeductionTypeCode;


}
