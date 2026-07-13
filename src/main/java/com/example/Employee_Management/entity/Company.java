package com.example.Employee_Management.entity;
import java.time.*;

import com.example.Employee_Management.enums.*;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="company")
public class Company {

    @Id
    @Column(name="company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long company_id;

    @Column(name="company_name")
    private String company_name;

    @Column(name="company_cin")
    private String company_cin;

    @Column(name="hiredate")
    private LocalDate hiredate;

    @Column(name="yearsincompany")
    private int years_in_company;

    @Column(name="lastlogintime")
    private LocalDateTime lastlogintime;

    @Column(name="employeetype")
    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    @Column(name="benefiterollment")
    @Enumerated(EnumType.STRING)
    private BenefitEnrollment benefitEnrollment;

    @Column(name="employeestatus")
    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;
}