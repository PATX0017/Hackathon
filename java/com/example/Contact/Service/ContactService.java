package com.example.Contact.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Contact.model.ContactClass;
import com.example.Contact.model.Organization;
import com.example.Contact.model.Person;
import com.example.Contact.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository repo;
	
	// CREATE PERSON
	public Person createContact(Person contact) {
		return repo.save(contact);
	}
	
	// CREATE ORGANIZATION
	public Organization createOrganization(Organization contact) {
		return repo.save(contact);
	}
	
	// READ
	public List<ContactClass> readAllContacts() {
		return repo.findAll();
	}
	
	// SEARCH BY ID
	
	// UPDATE
	
	// DELETE
	
}
