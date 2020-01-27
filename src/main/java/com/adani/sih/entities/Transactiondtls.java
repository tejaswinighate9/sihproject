package com.adani.sih.entities;
 import java.sql.Date;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transactiondtls {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long trans_id;
	private long time;
	private Date date;
	private long total_amt;
	private String trans_method;
	private String trans_type;
	
	public long getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(long trans_id) {
		this.trans_id = trans_id;
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
	public long getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(long total_amt) {
		this.total_amt = total_amt;
	}
	public String getTrans_method() {
		return trans_method;
	}
	public void setTrans_method(String trans_method) {
		this.trans_method = trans_method;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}

}
