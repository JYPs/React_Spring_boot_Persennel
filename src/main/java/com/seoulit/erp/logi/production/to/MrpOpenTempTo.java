package com.seoulit.erp.logi.production.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("MrpOpenTempTo")
public class MrpOpenTempTo extends BaseTo {

	private String mpsNo;
	private String bomNo;
	private String itemClassification;
	private String itemCode;
	private String itemName;
	private String unitOfMrp;
	private String planAmount;
	private String orderDate;
	private String requiredDate;
	private String totalLossRate;
	private String caculatedAmount;
	private String requiredAmount;

}
