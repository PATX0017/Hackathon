package com.example.Contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Contact.model.ContactClass;
import com.example.Contact.repository.ContactRepository;

@Controller
public class ContactController {

	@Autowired
	ContactRepository repo;
	
	@RequestMapping(value="/contact", method = RequestMethod.POST)
	public ContactClass createContact(@RequestBody ContactClass contact) {
		return repo.save(contact);
	}
	
	
}
