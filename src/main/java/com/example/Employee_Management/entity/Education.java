package com.example.Employee_Management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="education")
public class Education {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long education_id;
	private String education;
}
