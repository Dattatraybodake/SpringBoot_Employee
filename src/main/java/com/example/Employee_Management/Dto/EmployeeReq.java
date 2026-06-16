package com.example.Employee_Management.Dto;

public class EmployeeReq {

    String name;

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
