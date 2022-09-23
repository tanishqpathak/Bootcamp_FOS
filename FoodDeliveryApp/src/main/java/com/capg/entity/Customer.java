package com.capg.entity;

import javax.persistence.Entity;

@Entity
public class Customer {
	private String custName;
	private int custId;
	private String custAddress;
	private Long custContact;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public Long getCustContact() {
		return custContact;
	}
	public void setCustContact(Long custContact) {
		this.custContact = custContact;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custId=" + custId + ", custAddress=" + custAddress
				+ ", custContact=" + custContact + "]";
	}
	
	
}
