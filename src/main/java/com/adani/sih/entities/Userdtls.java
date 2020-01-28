package com.adani.sih.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserDtls")
public class Userdtls {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	private String firstName;
	private String lastName;
	private long phoneNo;
	private String address;

	@OneToOne
	@JoinColumn(name="email")
	private LoginDtls email;

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

	public LoginDtls getEmail() {
		return email;
	}

	public void setEmail(LoginDtls email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Userdtls [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo="
				+ phoneNo + ", address=" + address + ", email=" + email + "]";
	}

}
