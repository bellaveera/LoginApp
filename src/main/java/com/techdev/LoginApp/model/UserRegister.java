package com.techdev.LoginApp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_register")
public class UserRegister {
	@Id
	@Column
	private String username;
	@Column
	private String password;
	
	@Column
	private long ph_no;
	@Column
	private String email;
	@Column
	private Date dob;
	@Column
	private String gender;
	
	
	public UserRegister(String username, String password, long ph_no, String email, Date dob, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.ph_no = ph_no;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	

}
