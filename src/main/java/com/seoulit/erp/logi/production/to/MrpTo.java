package com.seoulit.erp.logi.production.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("MrpTo")
public class MrpTo extends BaseTo {
	private String mrpNo;
	private String mpsNo;
	private String mrpGatheringNo;
	private String itemClassifcation;
	private String itemCode;
	private String itemName;
	private String unitOfMrp;
	private String requiredAmount;
	private String orderDate;
	private String requiredDate;
	private String mrpGatheringStatus;

	}
