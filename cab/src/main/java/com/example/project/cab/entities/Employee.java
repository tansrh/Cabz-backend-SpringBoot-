package com.example.project.cab.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="empId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id")
	private Cab cab;
	
	
	
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}






	public int getEmpId() {
		return empId;
	}






	public void setEmpId(int empId) {
		this.empId = empId;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public Cab getCab() {
		return cab;
	}






	public void setCab(Cab cab) {
		this.cab = cab;
	}






	public Employee(String name, String address, Cab cab) {
		super();
		this.name = name;
		this.address = address;
		this.cab = cab;
	}
	
	

}
