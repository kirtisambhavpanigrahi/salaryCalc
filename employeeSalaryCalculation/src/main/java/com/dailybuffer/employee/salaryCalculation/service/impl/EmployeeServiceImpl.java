package com.dailybuffer.employee.salaryCalculation.service.impl;

import com.dailybuffer.employee.salaryCalculation.dto.EmployeeDto;
import com.dailybuffer.employee.salaryCalculation.model.Employee;
import com.dailybuffer.employee.salaryCalculation.repository.EmployeeRepository;
import com.dailybuffer.employee.salaryCalculation.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();

        BeanUtils.copyProperties(employeeDto, employee);
        employee.setPhoneNo(String.join("", employeeDto.getPhoneNo()));
        /*Employee e =  repository.save(employee);
        return e;*/
        return null;
    }
}
