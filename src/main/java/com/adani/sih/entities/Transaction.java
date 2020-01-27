package com.adani.sih.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Embeddable
public class Transaction implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@JoinColumn(name="INVOICE_ID")
	@OneToOne
	private Invoice invoiceId;
	
	@JoinColumn(name="TRANS_ID")
	@OneToOne
	private Transactiondtls transId;
	
	private long payableAmt;
	
	
	public Transaction(Invoice invoiceId, Transactiondtls transId, long payableAmt) {
		super();
		this.invoiceId = invoiceId;
		this.transId = transId;
		this.payableAmt = payableAmt;
	}
	public Transactiondtls getTransId() {
		return transId;
	}
	public void setTransId(Transactiondtls transId) {
		this.transId = transId;
	}
	public Invoice getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Invoice invoiceId) {
		this.invoiceId = invoiceId;
	}
	public long getPayableAmt() {
		return payableAmt;
	}
	public void setPayableAmt(long payableAmt) {
		this.payableAmt = payableAmt;
	}
	
	
}
