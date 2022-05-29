package com.example.virus_confirmation_management_application;

public class user_familyItem {
    private int image;
    private String name;
    private String vacnum;
    private String userstate;

    public user_familyItem(int image, String name, String vacnum, String userstate) {
        this.image = image;
        this.name= name;
        this.vacnum = vacnum;
        this.userstate=userstate;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVacnum() {
        return vacnum;
    }

    public void setVacnum(String vacnum) {
        this.vacnum = vacnum;
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate;
    }
}
