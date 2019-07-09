package com.seoulit.erp.hr.pm.to;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import com.seoulit.common.to.BaseTo;

import lombok.Getter;
import lombok.Setter;

@Data
@Alias("EmployeeTo")
public class EmployeeTo extends BaseTo {

    private String empCode;
    private String empName;
    private String password;
    private String positionCode;
    private String authorityCode;
    private String deptCode;
    private String businessPlaceCode;

}
