package com.adani.sih.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	private Invoice invoice_id;
	private long amt_pay;
	
	public Invoice getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(Invoice invoice_id) {
		this.invoice_id = invoice_id;
	}
	public long getAmt_pay() {
		return amt_pay;
	}
	public void setAmt_pay(long amt_pay) {
		this.amt_pay = amt_pay;
	}

}
