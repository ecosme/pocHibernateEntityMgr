package com.honeywell.corpo.dataaccess.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.honeywell.corpo.model.Employee;

//@Entity
//@Table(name="equipment", schema="public")
public class Equipment {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="equipment_idequipment_seq")
	@SequenceGenerator(name="equipment_idequipment_seq", sequenceName="equipment_idequipment_seq", allocationSize=1)
	@Column(nullable=false, unique=true)
	private int idEquipment;
	@Column(nullable=false)
	private String description;
	@Column(nullable=true)
	private double currentPrice;
	@Column(nullable=true)
	private String leaseDate;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEmployee")
	private Employee employee;

	public Equipment(){
		super();
	}
	
	public Equipment(String description, double currentPrice) {
		super();
		this.description = description;
		this.currentPrice = currentPrice;
	}

	public int getIdEquipment() {
		return idEquipment;
	}

	public void setIdEquipment(int idEquipment) {
		this.idEquipment = idEquipment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String toString(){
		return this.getIdEquipment() + " " + this.description + " " ;
	}
	
	
	
}
