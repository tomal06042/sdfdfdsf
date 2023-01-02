package com.Avatar.user.contact;

import com.Avatar.user.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

    public Contact findByNumber(String number);
}
