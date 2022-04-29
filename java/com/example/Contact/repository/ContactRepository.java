package com.example.Contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Contact.model.ContactClass;

public interface ContactRepository extends JpaRepository<ContactClass, Long> {

}
