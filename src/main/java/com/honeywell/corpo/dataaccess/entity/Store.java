package com.honeywell.corpo.dataaccess.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


//@Entity
//@Table(name="store", schema="public")
public class Store {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="store_idstore_seq")
	@SequenceGenerator(name="store_idstore_seq", sequenceName="store_idstore_seq", allocationSize=1)
	@Column(unique=true, nullable=false)
	private int idStore;
	@Column(nullable=false)
	private String address;
	@Column
	private int employees;
	@Column
	private int openAt;
	@Column
	private int closeAt;
	
	public Store(){
		super();
	}
	
	public Store(String address, int employees, int openAt, int closeAt) {
		super();
		this.address = address;
		this.employees = employees;
		this.openAt = openAt;
		this.closeAt = closeAt;
	}

	public int getIdStore() {
		return idStore;
	}

	public void setIdStore(int idStore) {
		this.idStore = idStore;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public int getOpenAt() {
		return openAt;
	}

	public void setOpenAt(int openAt) {
		this.openAt = openAt;
	}

	public int getCloseAt() {
		return closeAt;
	}

	public void setCloseAt(int closeAt) {
		this.closeAt = closeAt;
	}
	
	
	
}
