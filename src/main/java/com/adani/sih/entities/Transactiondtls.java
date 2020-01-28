package com.adani.sih.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TransactionDtls")
public class Transactiondtls {

	@Id
	private String transId;
	private long time;
	private Date date;
	private long totalAmt;
	private String transMethod;
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

	@Override
	public String toString() {
		return "Transactiondtls [trans_id=" + transId + ", time=" + time + ", date=" + date + ", totalAmt=" + totalAmt
				+ ", transMethod=" + transMethod + ", transType=" + transType + "]";
	}

}
