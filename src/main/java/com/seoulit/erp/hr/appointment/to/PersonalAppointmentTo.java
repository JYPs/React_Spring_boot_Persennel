package com.seoulit.erp.hr.appointment.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("PersonalAppointmentTo")
public class PersonalAppointmentTo extends BaseTo{

	private String 	appointmentNo,
	employeeNo,
	employeeName,
	department,
	position,
	applyDate,
	note,
	appointmentDivision,
	applyStatus;

	
	
}
