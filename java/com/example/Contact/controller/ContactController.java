package com.example.Contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Contact.Service.ContactService;
import com.example.Contact.model.ContactClass;
import com.example.Contact.model.Organization;
import com.example.Contact.model.Person;
import com.example.Contact.repository.ContactRepository;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactService service;
	
	@PostMapping("/create/person")
	public Person createPerson(@RequestBody Person contact) {
		return service.createContact(contact);
	}
	
	@PostMapping("/create/organization")
	public Organization createOrganization(@RequestBody Organization contact) {
		return service.createOrganization(contact);
	}
	
	@GetMapping("/contactlist")
	public List<ContactClass> findAllContacts() {
		return service.readAllContacts();
	}
	
	
}
