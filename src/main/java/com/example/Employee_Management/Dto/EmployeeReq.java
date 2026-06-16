package com.example.Employee_Management.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeReq {

    @NotBlank(message = "name Should be Not Black ")
    @Column(unique = true)
    String name;

    @NotBlank(message = " PassWord should Be Not Null and Black ")
    @NotNull
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EmployeeReq() {
    }

    public EmployeeReq(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
