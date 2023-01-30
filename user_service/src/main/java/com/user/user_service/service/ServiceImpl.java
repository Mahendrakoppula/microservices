package com.user.user_service.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.user.user_service.Entity.User;
@Service
public class ServiceImpl implements Userservice {

    List<User> list=List.of(new User(1, "mahendra koppula", "8886988714"),
                            new User(3, "maa hendrkoppula", "888714"),
                            new User(4, "maa4hendrkoppula", "887898083")
                            );
    @Override
    public User getUser(int id) {
        
        return list.stream().filter(user -> user.getUserid()==id).findAny().orElse(null);
        // return list.stream()
        //         .filter(user -> user.getUserid()==id).findAny().orElse(null);
    }
    
}
