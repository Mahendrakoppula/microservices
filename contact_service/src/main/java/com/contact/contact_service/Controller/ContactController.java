package com.contact.contact_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contact_service.Entity.Contact;
import com.contact.contact_service.service.Contactservice;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private Contactservice contactservice; 

    @RequestMapping("/user/{userid}")
    public List<Contact>getContacts(@PathVariable ("userid") int userid){
        return this.contactservice.getcontacts(userid);
    }
}
