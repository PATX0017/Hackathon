package com.example.Contact.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Contact.model.ContactClass;
import com.example.Contact.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository repo;
	
	// CREATE
	public ContactClass createContact(ContactClass contact) {
		return repo.save(contact);
	}
	
	// READ
	
	// SEARCH BY ID
	
	// UPDATE
	
	// DELETE
	
}
