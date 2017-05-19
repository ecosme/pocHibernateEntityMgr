package com.honeywell.corpo.dataaccess.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="vacationRequests")
public class vacationRequest {
	private int idEmployee;
	@Column(nullable = false)
	private Date dayRequested;
	@Column(nullable = false)
	private String allowed;
	@Column(nullable = false)
	private String comments;
	
	
	public vacationRequest(int idEmployee, Date dayRequested, String allowed, String comments) {
		super();
		this.idEmployee = idEmployee;
		this.dayRequested = dayRequested;
		this.allowed = allowed;
		this.comments = comments;
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public Date getDayRequested() {
		return dayRequested;
	}
	public void setDayRequested(Date dayRequested) {
		this.dayRequested = dayRequested;
	}
	public String getAllowed() {
		return allowed;
	}
	public void setAllowed(String allowed) {
		this.allowed = allowed;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
