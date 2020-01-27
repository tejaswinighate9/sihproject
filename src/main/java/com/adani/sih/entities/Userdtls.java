package com.adani.sih.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Userdtls {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	private String firstName;
	private String lastName;
	private long phoneNo;
	private String address;
	@OneToOne
	private Logindtls email;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Logindtls getEmail() {
		return email;
	}
	public void setEmail(Logindtls email) {
		this.email = email;
	}
	
	
}
