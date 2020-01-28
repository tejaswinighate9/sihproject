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
	private Long srNo;

	@JoinColumn(name = "INVOICE_ID")
	@OneToOne
	private String invoiceId;

	public TransClassId() {
		super();
	}

	public TransClassId(Long srNo, String invoiceId) {
		super();
		this.srNo = srNo;
		this.invoiceId = invoiceId;
	}

	public Long getSrNo() {
		return srNo;
	}

	public void setSrNo(Long srNo) {
		this.srNo = srNo;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	@Override
	public String toString() {
		return "TransClassId [srNo=" + srNo + ", invoiceId=" + invoiceId + "]";
	}

}
