package com.adani.sih.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class TransClassId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "TRANS_ID")
	@OneToOne
	private String transId;

	@JoinColumn(name = "INVOICE_ID")
	@OneToOne
	private String invoiceId;

	public TransClassId() {
		super();
	}

	public TransClassId(String transId, String invoiceId) {
		super();
		this.transId = transId;
		this.invoiceId = invoiceId;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

}
