package com.example.Contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Contact.Service.ContactService;
import com.example.Contact.model.Contact;
import com.example.Contact.model.Organization;
import com.example.Contact.model.Person;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService service;
	
	@PostMapping("/create/person")
	public Person createPersonContact(@RequestBody Person person) {
		return service.addPerson(person);
	}
	
	@PostMapping("/create/organization")
	public Organization createOrganizationContact(@RequestBody Organization organization) {
		return service.addOrganization(organization);
	}
	
	@GetMapping("/get")
	public List<Contact> contacts() {
		return service.getContacts();
	}
	
	@GetMapping("/get/{id}")
	public Contact getContactById(@PathVariable(value = "id") Long id) {
		return service.getContactById(id);
	}
	
	@PutMapping("/update/person/{id}")
	public Person updatePersonContact(@PathVariable(value = "id") Long id, @RequestBody Person contact) {
		return service.updatePerson(id, contact);
	}
	
	@PutMapping("update/organization/{id}")
	public Organization updateOrganizationContact(@PathVariable(value = "id") Long id, @RequestBody Organization organization) {
		return service.updateOrganization(id, organization);
	}
	
	@PatchMapping("/update/{id}/{newname}")
	public Contact updateName(@PathVariable(value = "id") Long id, @PathVariable(value = "newname") String newName) {
		return service.updateContactName(id, newName);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContact(@PathVariable(value = "id") Long id) {
		service.deleteContact(id);
	}
	
}