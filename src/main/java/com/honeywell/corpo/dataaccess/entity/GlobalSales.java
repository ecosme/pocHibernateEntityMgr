package com.honeywell.corpo.dataaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="globalSales", schema="public")
public class GlobalSales {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="globalstore_idgblstore_seq")
	@SequenceGenerator(name="globalstore_idgblstore_seq", sequenceName="globalstore_idgblstore_seq", allocationSize=1)
	@Column(unique=true, nullable=false)
	private Long idGblStore; 
	@Column(nullable=false)
	private int idStore;
	@Column(nullable=false)
	private int idProd;
	@Column(nullable=false)
	private double quantity;
}
