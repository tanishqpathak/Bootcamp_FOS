package com.capg.entity;

import javax.persistence.Entity;

@Entity
public class Restuarant {
	private int restId;
	private String restName;
	private String restAddress;
	private Food restMenu;
	
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRestAddress() {
		return restAddress;
	}
	public void setRestAddress(String restAddress) {
		this.restAddress = restAddress;
	}

}
