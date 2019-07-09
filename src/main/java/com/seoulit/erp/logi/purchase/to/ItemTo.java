package com.seoulit.erp.logi.purchase.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("ItemTo")
public class ItemTo extends BaseTo {

	String itemCode, itemName, itemGroupCode, itemClassification,
	unitOfStock, lossRate, leadTime, standardUnitPrice, description;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemGroupCode() {
		return itemGroupCode;
	}

	public void setItemGroupCode(String itemGroupCode) {
		this.itemGroupCode = itemGroupCode;
	}

	public String getItemClassification() {
		return itemClassification;
	}

	public void setItemClassification(String itemClassification) {
		this.itemClassification = itemClassification;
	}

	public String getUnitOfStock() {
		return unitOfStock;
	}

	public void setUnitOfStock(String unitOfStock) {
		this.unitOfStock = unitOfStock;
	}

	public String getLossRate() {
		return lossRate;
	}

	public void setLossRate(String lossRate) {
		this.lossRate = lossRate;
	}

	public String getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}

	public String getStandardUnitPrice() {
		return standardUnitPrice;
	}

	public void setStandardUnitPrice(String standardUnitPrice) {
		this.standardUnitPrice = standardUnitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ItemTo [itemCode=" + itemCode + ", itemName=" + itemName + ", itemGroupCode=" + itemGroupCode
				+ ", itemClassification=" + itemClassification + ", unitOfStock=" + unitOfStock + ", lossRate="
				+ lossRate + ", leadTime=" + leadTime + ", standardUnitPrice=" + standardUnitPrice + ", description="
				+ description + "]";
	}
	
}
