package com.siux.contact.contactlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siux.contact.contactlist.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
