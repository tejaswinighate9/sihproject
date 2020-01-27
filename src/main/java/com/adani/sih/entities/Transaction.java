package com.adani.sih.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Transactiondtls trans_id;
	private long invoice_id;
	private long amt_pay;
	
	public Transactiondtls getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(Transactiondtls trans_id) {
		this.trans_id = trans_id;
	}
	public long getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(long invoice_id) {
		this.invoice_id = invoice_id;
	}
	public long getAmt_pay() {
		return amt_pay;
	}
	public void setAmt_pay(long amt_pay) {
		this.amt_pay = amt_pay;
	}

}
