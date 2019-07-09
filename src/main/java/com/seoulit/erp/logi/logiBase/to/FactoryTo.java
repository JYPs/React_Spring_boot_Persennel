package com.seoulit.erp.logi.logiBase.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

@Alias("FactoryTo")
public class FactoryTo extends BaseTo{

	private String factoryCode, factoryName, 
					factoryManagerCode, availableCapacity, 
					availableStatus, phone, adress;

	public String getFactoryCode() {
		return factoryCode;
	}

	public void setFactoryCode(String factoryCode) {
		this.factoryCode = factoryCode;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getFactoryManagerCode() {
		return factoryManagerCode;
	}

	public void setFactoryManagerCode(String factoryManagerCode) {
		this.factoryManagerCode = factoryManagerCode;
	}

	public String getAvailableCapacity() {
		return availableCapacity;
	}

	public void setAvailableCapacity(String availableCapacity) {
		this.availableCapacity = availableCapacity;
	}

	public String getAvailableStatus() {
		return availableStatus;
	}

	public void setAvailableStatus(String availableStatus) {
		this.availableStatus = availableStatus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
