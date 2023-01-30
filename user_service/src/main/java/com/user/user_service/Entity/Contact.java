package com.user.user_service.Entity;

public class Contact {
    private int Cid;
    private String email;
    private String Contactname;
    
    private int userid;

    public Contact() {
    }

    public Contact(int cid, String email, String contactname, int userid) {
        Cid = cid;
        this.email = email;
        Contactname = contactname;
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
