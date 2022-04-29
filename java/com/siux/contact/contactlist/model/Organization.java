package com.siux.contact.contactlist.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Organization extends Contact {
	
	@Column(name="website")
	protected String website;
	
	public Organization() {
		
	}
	
	public Organization(String name, String phone_number, LocalDateTime created_at, String website) {
		super(name, phone_number, created_at);
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
