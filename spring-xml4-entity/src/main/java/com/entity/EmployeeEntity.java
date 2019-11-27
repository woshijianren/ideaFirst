package com.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class EmployeeEntity {
    private Integer id;
    private String name;
    private BigDecimal salary;
    private Date hiredate;
    private Integer deptId;
}
