package com.honeywell.corpo.dataaccess.entity;


import static javax.persistence.GenerationType.TABLE;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="products", schema="public")
@TableGenerator(name="prodGen", initialValue=0, allocationSize=10)
public class Product {
	
	@Id
	@GeneratedValue(strategy=TABLE, generator="prodGen")
	@Column(name="idProd", unique=true, nullable = false)
	private int idProd;
	@Column(nullable = false)
	private String description;
	
	public Product(){
		
		this.description = "";
	}
	public Product(String prodName){
		//super();
		this.description = prodName;
	}
	
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProduct) {
		this.idProd = idProduct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String prodName) {
		this.description = prodName;
	}
	
	

}
