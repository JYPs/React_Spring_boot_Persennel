package com.seoulit.erp.logi.purchase.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("WarehousingTo")
public class WarehousingTo extends BaseTo {

	String itemCode, orderNo, itemName, orderAmount,
	warehousingAmount, unitWarehousing, customer, description,
	warehousingDate,warehousingNo;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getWarehousingAmount() {
		return warehousingAmount;
	}

	public void setWarehousingAmount(String warehousingAmount) {
		this.warehousingAmount = warehousingAmount;
	}

	public String getUnitWarehousing() {
		return unitWarehousing;
	}

	public void setUnitWarehousing(String unitWarehousing) {
		this.unitWarehousing = unitWarehousing;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWarehousingDate() {
		return warehousingDate;
	}

	public void setWarehousingDate(String warehousingDate) {
		this.warehousingDate = warehousingDate;
	}

	public String getWarehousingNo() {
		return warehousingNo;
	}

	public void setWarehousingNo(String warehousingNo) {
		this.warehousingNo = warehousingNo;
	}

	@Override
	public String toString() {
		return "WarehousingTo [itemCode=" + itemCode + ", orderNo=" + orderNo + ", itemName=" + itemName
				+ ", orderAmount=" + orderAmount + ", warehousingAmount=" + warehousingAmount + ", unitWarehousing="
				+ unitWarehousing + ", customer=" + customer + ", description=" + description + ", warehousingDate="
				+ warehousingDate + ", warehousingNo=" + warehousingNo + "]";
	}

}
