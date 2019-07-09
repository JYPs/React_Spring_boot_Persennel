package com.seoulit.erp.logi.production.to;


import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("WorkInstructionTo")
public class WorkInstructionTo extends BaseTo {

	private String workInstructionNo;
	private String mrpGatheringNo;
	private String itemCode;
	private String itemName;
	private String instructionDate;
	private String unitOfWorkInstruction;
	private String workInstructionAmount;
	private String productionStatus;
	private String description;
	private String workInstructionStatus;
	private String productionLineCode;
}