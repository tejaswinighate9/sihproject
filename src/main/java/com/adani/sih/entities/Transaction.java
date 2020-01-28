package com.adani.sih.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

//	@EmbeddedId
//	private TransClassId transClassId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long Id;

	@ManyToOne
	@JoinColumn(name = "SR_NO")
	private Transactiondtls srNo;

	@OneToOne
	@JoinColumn(name = "INVOICE_ID")
	private Invoice invoiceId;

	@Column(name = "PAYABLE_AMT")
	private long payableAmt;

	public Transaction() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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

	public long getPayableAmt() {
		return payableAmt;
	}

	public void setPayableAmt(long payableAmt) {
		this.payableAmt = payableAmt;
	}

	@Override
	public String toString() {
		return "Transaction [Id=" + Id + ", srNo=" + srNo + ", invoiceId=" + invoiceId + ", payableAmt=" + payableAmt
				+ "]";
	}

	

}
