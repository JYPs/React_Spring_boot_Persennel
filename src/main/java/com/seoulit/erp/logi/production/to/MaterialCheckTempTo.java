package com.seoulit.erp.logi.production.to;

import com.seoulit.common.to.BaseTo;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Setter
@Getter
@Alias("MaterialCheckTempTo")
public class MaterialCheckTempTo extends BaseTo {
    private String itemCode;
    private String itemName;
    private String stocktaking;
    private String safetyStocktaking;
    private String stockStatus;
    private String safetyStockStatus;
}