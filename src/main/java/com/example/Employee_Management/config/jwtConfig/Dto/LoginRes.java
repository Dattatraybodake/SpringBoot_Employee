package com.example.Employee_Management.config.jwtConfig.Dto;


public class LoginRes {

    String accessToken;

    String token="Bearer ";


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LoginRes() {
    }

    public LoginRes(String accessToken, String token) {
        this.accessToken = accessToken;
        this.token = token;
    }
}
