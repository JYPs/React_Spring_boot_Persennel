package com.seoulit.erp.hr.appointment.to;

import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("AppointmentTo")
public class AppointmentTo extends BaseTo{

	private String 	appointmentNo,
	appointmentTitle,
	appointmentDivision,
	appointmentDate,
	appointmentDirector,
	approvalStatus,
	note,
	appointmentSeq;
}
