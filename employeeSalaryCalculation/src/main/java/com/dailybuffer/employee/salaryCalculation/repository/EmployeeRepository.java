package com.dailybuffer.employee.salaryCalculation.repository;

import com.dailybuffer.employee.salaryCalculation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
