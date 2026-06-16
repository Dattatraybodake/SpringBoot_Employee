package com.example.Employee_Management.service;

import com.example.Employee_Management.Dto.EmployeeReq;
import com.example.Employee_Management.Dto.LoginReq;
import com.example.Employee_Management.config.jwtConfig.Dto.LoginRes;
import com.example.Employee_Management.config.jwtConfig.JwtProvider;
import com.example.Employee_Management.entity.Employee;
import com.example.Employee_Management.entity.Role;
import com.example.Employee_Management.repository.EmployeeRepository;
import com.example.Employee_Management.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuthService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    RoleRepo roleRepo;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtProvider jwtProvider;

    public String register(EmployeeReq employeeReq)
    {
        try
        {
            if(!employeeRepository.existsByUserName(employeeReq.getName())) {
                Employee employee = new Employee();
                employee.setUserName(employeeReq.getName());
                employee.setPassword(encoder.encode(employeeReq.getPassword()));

                Set<Role> roles = new HashSet<>();
                Role role = roleRepo.findByName("ROLE_USER");
                roles.add(role);
                employee.setRoleSet(roles);
                employeeRepository.save(employee);

                return " Register Succesfully ";
            }
            else {
                return " User Name Already Exist !";
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return " Something went wrong !"+e.getMessage();
        }

    }


    public LoginRes login(LoginReq loginReq)
    {
        System.out.println(loginReq.toString());
        Authentication authentication=new UsernamePasswordAuthenticationToken(
                loginReq.getUserName(),
                loginReq.getPassword()
        );

        System.out.println(authentication.getName().toString());
        System.out.println(authentication.getPrincipal().toString());
        String token= jwtProvider.generateToken(authentication);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        LoginRes loginRes=new LoginRes();
        loginRes.setAccessToken(token);
        return loginRes;
    }


}
