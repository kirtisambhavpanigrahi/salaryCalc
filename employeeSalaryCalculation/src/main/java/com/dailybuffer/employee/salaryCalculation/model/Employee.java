package com.dailybuffer.employee.salaryCalculation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(schema = "employee")
@Getter
@Setter
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    String firstName;
    String lastName;
    String email;
    String phoneNo;
    Date doj;
    BigDecimal salary;
}
