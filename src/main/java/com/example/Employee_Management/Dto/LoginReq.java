package com.example.Employee_Management.Dto;

import jakarta.validation.constraints.NotBlank;

public class LoginReq {

    @NotBlank(message = " User Name Should Not Be Blank")
    private String userName;

    @NotBlank(message = " Password Should Not Be Blank")
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public LoginReq() {
    }

    public LoginReq(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginReq{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
