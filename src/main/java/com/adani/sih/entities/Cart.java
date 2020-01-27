package com.adani.sih.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cartId;
	@OneToOne
	@JoinColumn(name="INVOICE_ID")
	private Invoice invoiceId;
	private long payableAmt;
	 
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
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
