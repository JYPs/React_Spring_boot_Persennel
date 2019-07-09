package com.seoulit.erp.logi.purchase.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("OrderDetailTo")
public class OrderDetailTo extends BaseTo {

	String orderDetailNo, orderNo, itemCode, itemName,
	unitOfOrder, dueDateOfOrder, deliveryScheduleDate,
	orderAmount, unitPriceOfOrder, sumPriceOfOrder, description,
	mrpGatheringNo, orderDetailStatus,slipRegistStatus;

	public String getOrderDetailNo() {
		return orderDetailNo;
	}

	public void setOrderDetailNo(String orderDetailNo) {
		this.orderDetailNo = orderDetailNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

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

	public String getDueDateOfOrder() {
		return dueDateOfOrder;
	}

	public void setDueDateOfOrder(String dueDateOfOrder) {
		this.dueDateOfOrder = dueDateOfOrder;
	}

	public String getDeliveryScheduleDate() {
		return deliveryScheduleDate;
	}

	public void setDeliveryScheduleDate(String deliveryScheduleDate) {
		this.deliveryScheduleDate = deliveryScheduleDate;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getUnitPriceOfOrder() {
		return unitPriceOfOrder;
	}

	public void setUnitPriceOfOrder(String unitPriceOfOrder) {
		this.unitPriceOfOrder = unitPriceOfOrder;
	}

	public String getSumPriceOfOrder() {
		return sumPriceOfOrder;
	}

	public void setSumPriceOfOrder(String sumPriceOfOrder) {
		this.sumPriceOfOrder = sumPriceOfOrder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMrpGatheringNo() {
		return mrpGatheringNo;
	}

	public void setMrpGatheringNo(String mrpGatheringNo) {
		this.mrpGatheringNo = mrpGatheringNo;
	}

	public String getOrderDetailStatus() {
		return orderDetailStatus;
	}

	public void setOrderDetailStatus(String orderDetailStatus) {
		this.orderDetailStatus = orderDetailStatus;
	}

	public String getSlipRegistStatus() {
		return slipRegistStatus;
	}

	public void setSlipRegistStatus(String slipRegistStatus) {
		this.slipRegistStatus = slipRegistStatus;
	}

	@Override
	public String toString() {
		return "OrderDetailTo [orderDetailNo=" + orderDetailNo + ", orderNo=" + orderNo + ", itemCode=" + itemCode
				+ ", itemName=" + itemName + ", unitOfOrder=" + unitOfOrder + ", dueDateOfOrder=" + dueDateOfOrder
				+ ", deliveryScheduleDate=" + deliveryScheduleDate + ", orderAmount=" + orderAmount
				+ ", unitPriceOfOrder=" + unitPriceOfOrder + ", sumPriceOfOrder=" + sumPriceOfOrder + ", description="
				+ description + ", mrpGatheringNo=" + mrpGatheringNo + ", orderDetailStatus=" + orderDetailStatus
				+ ", slipRegistStatus=" + slipRegistStatus + "]";
	}
	
}
