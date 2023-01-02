package com.Avatar.user.contact;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public List<Contact> getContactList(){
        return contactRepository.findAll();
    }

    public Contact getAnContactByNumber(String number){
        return contactRepository.findByNumber(number);
    }

    public void saveContactData(Contact contact){
        contactRepository.save(contact);
    }

}
