/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;
/*

2017243053 조장환

 */
public class manager_user_Item {
    private int image;
    private String name;
    private String general;
    private String number;
    private String time;
    private String address;

    public manager_user_Item(int image, String name, String general, String number, String time, String address) {
        this.image = image;
        this.name= name;
        this.general = general;
        this.number=number;
        this.time=time;
        this.address=address;
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

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
