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

@Entity
@Inheritance
@Table(name = "contact_list")
public abstract class ContactClass {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	protected Long id;
	
	@Column(name="name")
	protected String name;
	
	@Column(name="phone_number")
	protected String phone_number;

	public ContactClass(String name, String phone_number) {
		this.name = name;
		this.phone_number = phone_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phone_number;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}

	public Long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	
}
