package com.Avatar.user.contact;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/contact")
    public List<Contact> getAll() {
        return contactService.getContactList();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/contact/{number}")
    public Contact getContactByNumber(@PathVariable String number) {
        return contactService.getAnContactByNumber(number);
    }

    @PostMapping("/contact")
    public void addContact(@RequestBody Contact contact) {
        contactService.saveContactData(contact);
    }

}

