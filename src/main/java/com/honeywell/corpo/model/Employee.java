package com.honeywell.corpo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.honeywell.corpo.dataaccess.entity.Equipment;

import javax.persistence.GenerationType;



@Entity
@Table(name="employee", schema="public")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="employee_idemployee_seq")
	@SequenceGenerator(name="employee_idemployee_seq", sequenceName="employee_idemployee_seq", allocationSize=1)
	@Column(unique=true, nullable=false)
	private int idemployee;
	@Column(nullable= false)
	private String fName;
	@Column(nullable= false)
	private String lName;
	@Column(nullable = true)
	private String ssn;
	@Column(nullable = true)
	private String address;
	@Column(nullable = true)
	private String position;
	@OneToMany(orphanRemoval=false, mappedBy="employee", cascade=CascadeType.ALL)
	private List<Equipment> equipment = new ArrayList<Equipment>();
	
	
	public Employee(){
		super();
	}
	
	public Employee(String fname, String lname, String ssn, String address) {
		super();
		this.fName = fname;
		this.lName = lname;
		this.ssn = ssn;
		this.address = address;
	}
	
	public Employee(String fname, String lname, String ssn, String address, List<Equipment> eqs) {
		this(fname, lname, ssn, address);
		this.equipment = eqs;
	}
	
	
	public int getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(int idemployee) {
		this.idemployee = idemployee;
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

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}

		
	
}
