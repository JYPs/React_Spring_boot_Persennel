package com.seoulit.erp.logi.logiBase.to;

import org.apache.ibatis.type.Alias;

@Alias("DispositionWorkTo")
public class DispositionWorkTo {

	private String factoryCode, factoryProductionLineNo, 
	productionLineCode, empCode, empName, position, employmentStatus;

	public String getFactoryCode() {
		return factoryCode;
	}

	public void setFactoryCode(String factoryCode) {
		this.factoryCode = factoryCode;
	}

	public String getFactoryProductionLineNo() {
		return factoryProductionLineNo;
	}

	public void setFactoryProductionLineNo(String factoryProductionLineNo) {
		this.factoryProductionLineNo = factoryProductionLineNo;
	}

	public String getProductionLineCode() {
		return productionLineCode;
	}

	public void setProductionLineCode(String productionLineCode) {
		this.productionLineCode = productionLineCode;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
}
