package com.user.user_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_service.Entity.User;
import com.user.user_service.service.ServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ServiceImpl serviceImpl; 

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userid}")
    public User getUser(@PathVariable("userid")int userid){
       User user= this.serviceImpl.getUser(userid);
        List contacts=this.restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+user.getUserid(), List.class);
        user.setContacts(contacts);
        return user;
        
    }
}
