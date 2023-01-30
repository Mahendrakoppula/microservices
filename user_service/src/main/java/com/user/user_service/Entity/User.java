package com.user.user_service.Entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userid;
    private String name;
    private String phone;

    List<Contact> contacts= new ArrayList<>();

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public User() {
    }

    public User(int userid, String name, String phone) {
        this.userid = userid;
        this.name = name;
        this.phone = phone;
    }

    public User(int userid, String name, String phone, List<Contact> contacts) {
        this.userid = userid;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

}
