package com.adani.sih.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logindtls {
	
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

}
