package com.adani.sih.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_dtls")
public class LoginDtls {

	@Id
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PWD")
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
