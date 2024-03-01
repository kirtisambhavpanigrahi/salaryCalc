package com.dailybuffer.employee.salaryCalculation.service;

import com.dailybuffer.employee.salaryCalculation.dto.EmployeeDto;
import com.dailybuffer.employee.salaryCalculation.model.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    public Employee saveEmployee(EmployeeDto employeeDto);
}
