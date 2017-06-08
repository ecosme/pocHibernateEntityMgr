package com.honeywell.corpo.dataaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="clients", schema="public")
public class Client {

	@Id
	@Column(name="idclient", unique=true, nullable=false)
	private String idclient;
	@Column(nullable=false)
	private String fname;
	@Column(nullable=false)
	private String lname;
	@Column(nullable=true)
	private int age;
	
	
	public Client(){
		super();
	}
	
	public Client(String idclient, String fname, String lname, int age) {
		super();
		this.idclient = idclient;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public String getIdclient() {
		return idclient;
	}
	public void setIdclient(String idclient) {
		this.idclient = idclient;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
