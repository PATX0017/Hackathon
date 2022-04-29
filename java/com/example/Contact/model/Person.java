package com.example.Contact.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Person extends ContactClass {

	@Column(name="email")
	public String email;
	
	
	
	public Person(String name, String phone_number) {
		super(name, phone_number);
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String phone_number, String email) {
		super(name, phone_number);
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
