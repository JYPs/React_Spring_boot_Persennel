package com.seoulit.erp.logi.purchase.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("OrderInfoTo")
public class OrderInfoTo extends BaseTo {

	String orderNo, customerCode, orderDate,
	personCodeInCharge, description, orderInfoStatus,slipRegistStatus;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getPersonCodeInCharge() {
		return personCodeInCharge;
	}

	public void setPersonCodeInCharge(String personCodeInCharge) {
		this.personCodeInCharge = personCodeInCharge;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderInfoStatus() {
		return orderInfoStatus;
	}

	public void setOrderInfoStatus(String orderInfoStatus) {
		this.orderInfoStatus = orderInfoStatus;
	}

	public String getSlipRegistStatus() {
		return slipRegistStatus;
	}

	public void setSlipRegistStatus(String slipRegistStatus) {
		this.slipRegistStatus = slipRegistStatus;
	}

	@Override
	public String toString() {
		return "OrderInfoTo [orderNo=" + orderNo + ", customerCode=" + customerCode + ", orderDate=" + orderDate
				+ ", personCodeInCharge=" + personCodeInCharge + ", description=" + description + ", orderInfoStatus="
				+ orderInfoStatus + ", slipRegistStatus=" + slipRegistStatus + "]";
	}
	
}
