package com.adani.sih.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Embeddable
public class TransClassId implements Serializable {

	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "SR_NO")
	@ManyToOne
	private Transactiondtls srNo;

	@JoinColumn(name = "INVOICE_ID")
	@OneToOne
	private Invoice invoiceId;

	public TransClassId() {
		super();
	}

	
	public Transactiondtls getSrNo() {
		return srNo;
	}


	public void setSrNo(Transactiondtls srNo) {
		this.srNo = srNo;
	}


	public Invoice getInvoiceId() {
		return invoiceId;
	}


	public void setInvoiceId(Invoice invoiceId) {
		this.invoiceId = invoiceId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "TransClassId [srNo=" + srNo + ", invoiceId=" + invoiceId + "]";
	}

}
