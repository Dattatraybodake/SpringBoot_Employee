package com.example.Employee_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_Management.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
