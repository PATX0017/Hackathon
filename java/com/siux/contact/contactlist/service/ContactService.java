package com.siux.contact.contactlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siux.contact.contactlist.model.Contact;
import com.siux.contact.contactlist.model.Organization;
import com.siux.contact.contactlist.model.Person;
import com.siux.contact.contactlist.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepo;
	
	public Person addPerson(Person person) {
		return contactRepo.save(person);
	}
	
	public Organization addOrganization(Organization organization) {
		return contactRepo.save(organization);
	}
	
	public List<Contact> getContacts() {
		return contactRepo.findAll();
	}
	
	public Contact getContactById(Long id) { 
		return contactRepo.findById(id).get();
	}
	
	public Person updatePerson(Long id, Person contactDetails) {
		Person originalContact = (Person) contactRepo.findById(id).get();
		originalContact.setName(contactDetails.getName());
		originalContact.setPhone_number(contactDetails.getPhone_number());
		originalContact.setEmail(contactDetails.getEmail());
		return contactRepo.save(originalContact);
	}
	
	public Organization updateOrganization(Long id, Organization contactDetails) {
		Organization originalContact = (Organization) contactRepo.findById(id).get();
		originalContact.setName(contactDetails.getName());
		originalContact.setPhone_number(contactDetails.getPhone_number());
		originalContact.setWebsite(contactDetails.getWebsite());
		return contactRepo.save(originalContact);
	}
	
	public Contact updateContactName(Long id, String newName) {
		Contact updatedContact = contactRepo.getById(id);
		updatedContact.setName(newName);
		return contactRepo.save(updatedContact);
	}
	
	public void deleteContact(Long id) {
		contactRepo.deleteById(id);
	}
	
}
