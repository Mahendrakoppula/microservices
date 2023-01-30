package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.Entity.Contact;
@Service
public class contactServiceImpl implements Contactservice {

    List<Contact> list=List.of(new Contact(1,"mahe@gmail.com","mahe",1),
    new Contact(19,"mahi@gmail.com","mahi",1),
    new Contact(10,"mahendra@gmail.com","mahendra",3),
    new Contact(4,"mahendrako@gmail.com","mahendrakopp",4));
    
    @Override
    public List<Contact> getcontacts(int id) {
        // TODO Auto-generated method stub
        return list.stream().filter(contact->contact.getUserid()==id).collect(Collectors.toList());
        // return list.stream().filter(contact->contact.getUserid().equals(id)).collect(Collectors.toList());
    }
    
}
