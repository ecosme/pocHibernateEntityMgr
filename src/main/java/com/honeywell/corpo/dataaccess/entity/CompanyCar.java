package com.honeywell.corpo.dataaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Entity
//@Table(name="companycar", schema="public")
public class CompanyCar {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="companycar_id_car_seq")
	@SequenceGenerator(name="companycar_id_car_seq", sequenceName="companycar_id_car_seq", allocationSize=2)
	@Column(unique=true, nullable=false)
	private int idcar;
	
}
