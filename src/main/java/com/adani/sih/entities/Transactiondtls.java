package com.adani.sih.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TransactionDtls")
public class Transactiondtls {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SR_NO")
	private long srNo;

	@Column(name = "TRANS_ID")
	private String transId;

	@Column(name = "TIME")
	private long time;

	@Column(name = "DATE")
	private Date date;

	@Column(name = "TOTAL_AMT")
	private long totalAmt;

	@Column(name = "TRANS_METHOD")
	private String transMethod;

	@Column(name = "TRASN_TYPE")
	private String transType;

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(long totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getTransMethod() {
		return transMethod;
	}

	public void setTransMethod(String transMethod) {
		this.transMethod = transMethod;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public long getSrNo() {
		return srNo;
	}

	public void setSrNo(long srNo) {
		this.srNo = srNo;
	}

	@Override
	public String toString() {
		return "Transactiondtls [trans_id=" + transId + ", time=" + time + ", date=" + date + ", totalAmt=" + totalAmt
				+ ", transMethod=" + transMethod + ", transType=" + transType + "]";
	}

}
