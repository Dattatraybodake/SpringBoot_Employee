package com.example.Employee_Management.repository;

import com.example.Employee_Management.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {

    Role findByName(String name);

}
