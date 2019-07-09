package com.seoulit.erp.hr.circumstance.to;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("EmpAnnualDataTo")
public class EmpAnnualDataTo {
    private String standardYear;
    private String lengthOfService;
    private String empName;
    private String usedDays;
    private String restDays;
    private String deptName;
    private String usableDays;

}
