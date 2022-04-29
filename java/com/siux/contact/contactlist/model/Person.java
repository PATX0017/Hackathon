package com.siux.contact.contactlist.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Person extends Contact {
	
	@Column(name="email")
	protected String email;

	public Person() {
		
	}
	
	public Person(String name, String phone_number, LocalDateTime created_at, String email) {
		super(name, phone_number, created_at);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
