package com.example.virus_confirmation_management_application;

public class UserAccount {
    private String name;
    private String email;
    private String pwd;
    private String phonenum;
    private String uid;

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public UserAccount() {}

    public void setName(String name) {this.name = name;}

    public void setEmail(String email) {this.email = email;}

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String getPhonenum() {
        return phonenum;
    }
}
