package com.seoulit.erp.hr.pay.to;
import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Getter
@Setter
@Alias("SalaryInputTo")
public class SalaryInputTo extends BaseTo{

	private String paymentDate;
	private String empCode;
	private String salaryTypeCode;
	private String totalSalary;
	private String totalDeductionPrice;
	private String deptCode;
	private String positionCode;
	private String hireDate;
	private String retireDate;
	private String chinePayments;
	private List<PayDeductionTo> payDeductionList;

}
