package com.example.Contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Organization extends ContactClass {
	
	@Column(name="website")
	protected String website;
	
	public Organization(String name, String phoneNumber, String website) {
		super(name, phoneNumber);
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
}
