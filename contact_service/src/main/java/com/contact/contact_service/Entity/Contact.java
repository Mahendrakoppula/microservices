package com.contact.contact_service.Entity;

public class Contact {
    private int Cid;
    private String email;
    private String Contactname;
    
    private int userid;

    public Contact() {
    }

    public Contact(int cid, String email, String contactname, int userid) {
        this.Cid = cid;
        this.email = email;
        this.Contactname = contactname;
        this.userid = userid;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactname() {
        return Contactname;
    }

    public void setContactname(String contactname) {
        Contactname = contactname;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    
    
}