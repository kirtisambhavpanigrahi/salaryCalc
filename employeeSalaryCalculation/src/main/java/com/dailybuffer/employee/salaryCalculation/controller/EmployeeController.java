package com.dailybuffer.employee.salaryCalculation.controller;

import com.dailybuffer.employee.salaryCalculation.dto.EmployeeDto;
import com.dailybuffer.employee.salaryCalculation.model.Employee;
import com.dailybuffer.employee.salaryCalculation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee receiveAndSaveEmployee(@RequestBody EmployeeDto employeeDto) {
        return service.saveEmployee(employeeDto);
    }
}
