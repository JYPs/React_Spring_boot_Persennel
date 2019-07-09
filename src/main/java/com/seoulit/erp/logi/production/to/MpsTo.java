package com.seoulit.erp.logi.production.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("MpsTo")
public class MpsTo extends BaseTo {

	String mpsNo;
	String mpsPlanClassification;
	String contractDetailNo;
	String salesPlanNo;
	String itemCode;
	String itemName;
	String unitOfMps;
	String mpsPlanDate;
	String mpsPlanAmount;
	String dueDateOfMps;
	String scheduledEndDate;
	String mrpApplyStatus;
	String description;

}
