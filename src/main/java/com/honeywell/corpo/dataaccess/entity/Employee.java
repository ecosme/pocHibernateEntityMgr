package com.honeywell.corpo.dataaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;

@Entity
@Table(name="Employees")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(unique=true, nullable=false)
	private int idEmployee;
	@Column(nullable = false)
	private String ssn;
	@Column(nullable = false)
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	private LocalUser flocalUser;
	
	
	
	public Employee(String ssn, String address) {
		super();
		this.ssn = ssn;
		this.address = address;
	}
	
	
	public LocalUser getFlocalUser() {
		return flocalUser;
	}
	public void setFlocalUser(LocalUser flocalUser) {
		this.flocalUser = flocalUser;
	}
	
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
