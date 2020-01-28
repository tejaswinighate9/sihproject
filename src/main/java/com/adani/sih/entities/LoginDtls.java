package com.adani.sih.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoginDtls")
public class LoginDtls {

	@Id
	private String email;
	private String pwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Logindtls [email=" + email + ", pwd=" + pwd + "]";
	}

}
