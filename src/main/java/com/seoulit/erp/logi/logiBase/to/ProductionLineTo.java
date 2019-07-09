package com.seoulit.erp.logi.logiBase.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Alias("ProductionLineTo")
public class ProductionLineTo extends BaseTo {
	private String productionLineCode, productableItemCode, minAvlStaff, maxAvlStaff, dailyAvrgPrdct;
}
