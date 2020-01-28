package com.adani.sih.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Invoice")
public class Invoice {

	@Id
	private String invoiceId;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private Userdtls userId;
	
	@Column(name="DUE_DATE")
	private Date dueDate;
	
	@Column(name="AMOUNT")
	private long amount;
	
	@Column(name="CONTAINER_NO")
	private long containerNo;
	
	@Column(name="STATUS")
	private String status;

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Userdtls getUserId() {
		return userId;
	}

	public void setUserId(Userdtls userId) {
		this.userId = userId;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(long containerNo) {
		this.containerNo = containerNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", userId=" + userId + ", dueDate=" + dueDate + ", amount=" + amount
				+ ", containerNo=" + containerNo + ", status=" + status + "]";
	}

}
