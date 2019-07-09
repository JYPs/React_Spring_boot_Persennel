package com.seoulit.erp.logi.purchase.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("OrderGatheringTo")
public class OrderGatheringTo extends BaseTo {
	
	String itemCode, itemName, unitOfOrder, deliveryScheduleDate,
	amount, orderAmount, orderGatheringStatus, mrpGatheringNo;

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

	public String getUnitOfOrder() {
		return unitOfOrder;
	}

	public void setUnitOfOrder(String unitOfOrder) {
		this.unitOfOrder = unitOfOrder;
	}

	public String getDeliveryScheduleDate() {
		return deliveryScheduleDate;
	}

	public void setDeliveryScheduleDate(String deliveryScheduleDate) {
		this.deliveryScheduleDate = deliveryScheduleDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderGatheringStatus() {
		return orderGatheringStatus;
	}

	public void setOrderGatheringStatus(String orderGatheringStatus) {
		this.orderGatheringStatus = orderGatheringStatus;
	}

	public String getMrpGatheringNo() {
		return mrpGatheringNo;
	}

	public void setMrpGatheringNo(String mrpGatheringNo) {
		this.mrpGatheringNo = mrpGatheringNo;
	}

	@Override
	public String toString() {
		return "OrderGatheringTo [itemCode=" + itemCode + ", itemName=" + itemName + ", unitOfOrder=" + unitOfOrder
				+ ", deliveryScheduleDate=" + deliveryScheduleDate + ", amount=" + amount + ", orderAmount="
				+ orderAmount + ", orderGatheringStatus=" + orderGatheringStatus + ", mrpGatheringNo=" + mrpGatheringNo
				+ "]";
	}
	
}
