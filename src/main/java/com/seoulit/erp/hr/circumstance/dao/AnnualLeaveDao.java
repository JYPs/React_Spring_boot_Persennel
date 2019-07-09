package com.seoulit.erp.hr.circumstance.dao;

import com.seoulit.erp.hr.circumstance.to.AnnualLeaveTo;
import com.seoulit.erp.hr.circumstance.to.EmpAnnualDataTo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AnnualLeaveDao {

	List<AnnualLeaveTo> selectAnnualLeaveList();
	void createAnnualLeave(Map<String, String> map);
	void updateAnnualLeave(AnnualLeaveTo annualLeaveTo);
	void deleteAnnualLeave(AnnualLeaveTo annualLeaveTo);
	void insertAnnualLeave(AnnualLeaveTo annualLeaveTo);

    EmpAnnualDataTo selectEmpAnnualData(String empCode);
}
