package com.example.Employee_Management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="personal_details")
public class PersonalDetails {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long pid;
	private String address;
	private String pan_number;
	private int pfnumber;
	private int uannumber;
	private int esi_number;
	private String bankname;
	private String ifsc_code;
	private int account_number;
}