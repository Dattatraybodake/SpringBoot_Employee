package com.example.Employee_Management.entity;

import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//Earnings
	private long paymentid;
	
	private BigDecimal basic;
	
	private BigDecimal da;
	
	private BigDecimal hra;
	
	private BigDecimal petrolTravelAllowance;
	
	private BigDecimal vehicleMaintainanceAllowance;
	
	private BigDecimal other_Allowance;
	
	//Deductions
	private BigDecimal pfContribution;
	
	private BigDecimal professionalTax;
	
	private BigDecimal esicContribution;
	
	private BigDecimal totalDeduction;
	
	private BigDecimal netAmout;
	
	private BigDecimal amountinwords;
}