package com.example.virus_confirmation_management_application;

class Manager_User_Data {

//item_layout에 들어갈 데이터


    String User_message;//item에 넣어질 메세지
    String User_age;
    String User_area;
    String User_ph_number;
    String User_name;
    int User_resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return User_resourceId;
    }

    public Manager_User_Data(int i, String s) {
    }

    public  int getUser_resourceId(){return User_resourceId;}
    public String getMessage() {
        return User_message;
    }
    public String getUser_age() {
        return User_age;
    }
    public String getUser_name() {
        return User_name;
    }
    public String getUser_area() {
        return User_area;
    }
    public String getUser_ph_number() {return User_ph_number;}


    public void setMessage(String message) {
        this.User_message = message;
    }
    public void setUser_age(String user_age) {
        this.User_message = user_age;
    }
    public void setUser_name(String user_name) {
        this.User_message = user_name;
    }
    public void setUser_ph_number(String user_ph_number) {
        this.User_message = user_ph_number;
    }
    public void setUser_area(String user_area) {
        this.User_message = user_area;
    }

    public void setResourceId(int resourceId) {
        this.User_resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_User_Data(int resourceId, String message, String age,String name,String ph_number,String area) {
        this.User_message = message;
        this.User_resourceId = resourceId;
        this.User_age = age;
        this.User_name = name;
        this.User_ph_number = ph_number;
        this.User_area = area;



    }
}