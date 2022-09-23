package com.capg.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Payment {
	
	private int payId;
	private Date payDate;
	private String payTime;
	private String payType;
	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	@Override
	public String toString() {
		return "Payment [payId=" + payId + ", payDate=" + payDate + ", payTime=" + payTime + ", payType=" + payType
				+ "]";
	}
	
	
}
