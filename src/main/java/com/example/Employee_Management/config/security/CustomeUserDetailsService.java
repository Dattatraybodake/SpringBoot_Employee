package com.example.Employee_Management.config.security;

import com.example.Employee_Management.entity.Employee;
import com.example.Employee_Management.exception.EmployeeNotFoundException;
import com.example.Employee_Management.repository.EmployeeRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomeUserDetailsService implements UserDetailsService {


    EmployeeRepository employeeRepository;

    public CustomeUserDetailsService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Employee employee=employeeRepository.findByUserName(username).orElseThrow(() -> new EmployeeNotFoundException(" Employee Not Found "));

        Set<GrantedAuthority> authorities=employee.getRoleSet().stream().map( e->{
            return  (new SimpleGrantedAuthority(e.getName()));
        }).collect(Collectors.toSet());

        return  User.builder()
                .username(username)
                .password(employee.getPassword())
                .authorities(authorities)
                .build();
    }
}
