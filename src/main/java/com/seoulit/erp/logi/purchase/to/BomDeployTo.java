package com.seoulit.erp.logi.purchase.to;

import org.apache.ibatis.type.Alias;

@Alias("BomDeployTo")
public class BomDeployTo {

	String itemCode, parentItemCode, itemName, itemClassification, leadTime,
	lossRate, netAmount, standardUnitPrice, parentItemName;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getParentItemCode() {
		return parentItemCode;
	}

	public void setParentItemCode(String parentItemCode) {
		this.parentItemCode = parentItemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemClassification() {
		return itemClassification;
	}

	public void setItemClassification(String itemClassification) {
		this.itemClassification = itemClassification;
	}

	public String getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}

	public String getLossRate() {
		return lossRate;
	}

	public void setLossRate(String lossRate) {
		this.lossRate = lossRate;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}

	public String getStandardUnitPrice() {
		return standardUnitPrice;
	}

	public void setStandardUnitPrice(String standardUnitPrice) {
		this.standardUnitPrice = standardUnitPrice;
	}

	public String getParentItemName() {
		return parentItemName;
	}

	public void setParentItemName(String parentItemName) {
		this.parentItemName = parentItemName;
	}

	@Override
	public String toString() {
		return "BomDeployTo [itemCode=" + itemCode + ", parentItemCode=" + parentItemCode + ", itemName=" + itemName
				+ ", itemClassification=" + itemClassification + ", leadTime=" + leadTime + ", lossRate=" + lossRate
				+ ", netAmount=" + netAmount + ", standardUnitPrice=" + standardUnitPrice + ", parentItemName="
				+ parentItemName + "]";
	}
	
}
