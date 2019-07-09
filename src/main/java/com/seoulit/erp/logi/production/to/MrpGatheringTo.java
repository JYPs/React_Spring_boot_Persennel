package com.seoulit.erp.logi.production.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Setter
@Getter
@Alias("MrpGatheringTo")
public class MrpGatheringTo extends BaseTo implements Serializable {

	private String mrpGatheringNo;
	private String orderOrProductionStatus;
	private String itemCode;
	private String itemName;
	private String unitOfMrpGathering;
	private String necessaryAmount;
	private String dueDate;
	private String claimDate;
	private String onGoingProcessStatus;

}


