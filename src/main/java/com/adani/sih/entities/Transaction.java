package com.adani.sih.entities;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {

	@EmbeddedId
	private TransClassId transClassId;
	
	@Column(name="PAYABLE_AMT")
	private long payableAmt;
	

	public Transaction() {
		super();
	}

	public Transaction(TransClassId transClassId, long payableAmt) {
		super();
		this.transClassId = transClassId;
		this.payableAmt = payableAmt;
	}

	public TransClassId getTransClassId() {
		return transClassId;
	}

	public void setTransClassId(TransClassId transClassId) {
		this.transClassId = transClassId;
	}

	public long getPayableAmt() {
		return payableAmt;
	}

	public void setPayableAmt(long payableAmt) {
		this.payableAmt = payableAmt;
	}

	@Override
	public String toString() {
		return "Transaction [transClassId=" + transClassId + ", payableAmt=" + payableAmt + "]";
	}

}
