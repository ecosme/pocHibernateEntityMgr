package com.honeywell.corpo.dataaccess.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="sequenceIdentifier")
public class SequenceIdentifier {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
