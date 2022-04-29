package com.example.Contact.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "contact")
public abstract class ContactClass {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	protected Long id;
	
	@Column(name="name")
	protected String name;
	
	@Column(name="phone_number")
	protected String phoneNumber;

	public ContactClass(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	
}
