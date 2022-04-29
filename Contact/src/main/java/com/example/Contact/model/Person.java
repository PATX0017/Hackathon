package com.example.Contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Person extends ContactClass {

	@Column(name="email")
	protected String email;
	
	public Person(String name, String phoneNumber, String email) {
		super(name, phoneNumber);
		this.email = email;
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
