package com.example.Contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Organization extends ContactClass {
	
	@Column(name="website")
	public String website;
	
	public Organization(String name, String phone_number, String website) {
		super(name, phone_number);
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
}
