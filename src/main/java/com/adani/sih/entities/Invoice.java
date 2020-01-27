package com.adani.sih.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {
	
	@Id
	private long invoice_id;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Userdtls user_id;
	private Date due_date;
	private long amount;
	private long container_no;
	private String status;
	
	public long getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(long invoice_id) {
		this.invoice_id = invoice_id;
	}
	public Userdtls getUser_id() {
		return user_id;
	}
	public void setUser_id(Userdtls user_id) {
		this.user_id = user_id;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getContainer_no() {
		return container_no;
	}
	public void setContainer_no(long container_no) {
		this.container_no = container_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
