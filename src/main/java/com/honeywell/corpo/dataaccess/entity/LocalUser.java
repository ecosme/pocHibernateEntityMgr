package com.honeywell.corpo.dataaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import static javax.persistence.GenerationType.SEQUENCE;

//@Entity
//@Table(name= "localUsers")
public class LocalUser {

		@Id
		@SequenceGenerator(name="localUsers_idLocalUser_seq", sequenceName="localUsers_idLocalUser_seq", allocationSize=1)
		@GeneratedValue(strategy = SEQUENCE, generator="localUsers_idLocalUser_seq")
		private int idLocalUser;
		@Column(nullable= false)
		private String fname;
		@Column(nullable= false)
		private String lname;
		
		
		
		public LocalUser(int idLocalUser, String fname, String lname) {
			super();
			this.idLocalUser = idLocalUser;
			this.fname = fname;
			this.lname = lname;
		}
		
		public int getIdLocalUser() {
			return idLocalUser;
		}
		public void setIdLocalUser(int idLocalUser) {
			this.idLocalUser = idLocalUser;
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
		
}
