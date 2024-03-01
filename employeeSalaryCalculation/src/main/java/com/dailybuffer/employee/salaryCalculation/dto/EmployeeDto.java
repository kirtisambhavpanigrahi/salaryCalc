package com.dailybuffer.employee.salaryCalculation.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Data
@JsonRootName("Employee")
public class EmployeeDto {
    String firstName;
    String lastName;
    String email;
    List<String> phoneNo;
    Date doj;
    BigDecimal salary;
}
