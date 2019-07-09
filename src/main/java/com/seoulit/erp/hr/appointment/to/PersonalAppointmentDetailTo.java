package com.seoulit.erp.hr.appointment.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("PersonalAppointmentDetailTo")
public class PersonalAppointmentDetailTo extends BaseTo{

	private String appointmentNo,
	employeeNo,
	appointmentHistory,
	currentInformation,
	preAppointmentInformation,
	appointmentInformation,
	note;
	
}
