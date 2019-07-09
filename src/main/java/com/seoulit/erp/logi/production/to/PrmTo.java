package com.seoulit.erp.logi.production.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("PrmTo")
public class PrmTo extends BaseTo {

	private String productionResultNo;
	private String workInstructionNo;
	private String productionDate;
	private String productionAmount;
	private String itemCode;
	private String itemName;
	private String unitOfProductionResult;
	private String description;


}
