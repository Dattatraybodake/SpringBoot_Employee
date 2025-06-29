package com.example.Employee_Management.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	public Employee() {
		super();
	}

	@Id
	@Column(name="employee_number")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int employee_number;
	
	@Column(name="name")
	private String name;
	
	@Column(name="department")
	private String department;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="location")
	private String location;
	
	@Column(name="paid_days")
	private int paid_days;
	
	@Column(name="Weekly_off")
	private int weekly_off;
	
	@Column(name="holiday")
	private int holiday;
	
	@Column(name="pan_number")
	private String pan_number;
	
	@Column(name="pf_uan")
	private long pf_uan;
	
	@Column(name="bank_name")
	private String bank_name;
	
	@Column(name="bank_acc_no")
	private long bank_acc_no;

	@Column(name="salary")
	private int salary;

	public int getEmployee_number() {
		return employee_number;
	}

	public void setEmployee_number(int employee_number) {
		this.employee_number = employee_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPaid_days() {
		return paid_days;
	}

	public void setPaid_days(int paid_days) {
		this.paid_days = paid_days;
	}

	public int getWeekly_off() {
		return weekly_off;
	}

	public void setWeekly_off(int weekly_off) {
		this.weekly_off = weekly_off;
	}

	public int getHoliday() {
		return holiday;
	}

	public void setHoliday(int holiday) {
		this.holiday = holiday;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public Long getPf_uan() {
		return pf_uan;
	}

	public void setPf_uan(long pf_uan) {
		this.pf_uan = pf_uan;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public long getBank_acc_no() {
		return bank_acc_no;
	}

	public void setBank_acc_no(long bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public Employee(int employee_number, String name, String department, String designation, String location,
			int paid_days, int weekly_off, int holiday, String pan_number, long pf_uan, String bank_name,
			long bank_acc_no, int salary) {
		super();
		this.employee_number = employee_number;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.location = location;
		this.paid_days = paid_days;
		this.weekly_off = weekly_off;
		this.holiday = holiday;
		this.pan_number = pan_number;
		this.pf_uan = pf_uan;
		this.bank_name = bank_name;
		this.bank_acc_no = bank_acc_no;
		this.salary = salary;
	}
}