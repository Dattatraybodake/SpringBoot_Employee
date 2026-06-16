package com.example.Employee_Management.controller;

import com.example.Employee_Management.Dto.EmployeeReq;
import com.example.Employee_Management.Dto.LoginReq;
import com.example.Employee_Management.config.jwtConfig.Dto.LoginRes;
import com.example.Employee_Management.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/Register")
    public ResponseEntity<String> register(@RequestBody @Valid EmployeeReq employeeReq)
    {
            String result =authService.register(employeeReq);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginRes> login(@RequestBody @Valid  LoginReq loginReq)
    {
        LoginRes loginRes=authService.login(loginReq);
        return new ResponseEntity<>(
                loginRes,HttpStatus.OK
        );
    }



}
