package com.example.virus_confirmation_management_application;

class Manager_User_Data {

//item_layout에 들어갈 데이터


    //String User_message;//item에 넣어질 메세지
    private String User_age;
    private String User_address;
    private String User_ph_number;
    private String User_name;
    private String User_sex;
    private int User_image;        //item에 넣어질 사진


    public int getUser_image() {
        return User_image;
    }

    //public Manager_User_Data(int i, String user_name, String user_area, String user_area,String user) {
   // }
/*
    public  int getUser_resourceId(){return User_resourceId;}
    public String getMessage() {
        return User_message;
    }

 */
    public String getUser_age() {return User_age;}
    public String getUser_name() {
        return User_name;
    }
    public String getUser_address() {
        return User_address;
    }
    public String getUser_sex() {
        return User_sex;
    }
    public String getUser_ph_number() {return User_ph_number;}


    public void setUser_age(String user_age) {this.User_age = user_age;}
    public void setUser_name(String user_name) {this.User_name = user_name;}
    public void setUser_ph_number(String user_ph_number) {this.User_ph_number = user_ph_number;}
    public void setUser_area(String user_address) {this.User_address = User_address;}
    public void setUser_sex(String user_sex) {this.User_sex = user_sex;}
    public void setResourceId(int resourceId) {this.User_image = resourceId;}



    //constructor 만들기
    public Manager_User_Data(int image, String name,String age,String ph_number,String sex,String address) {
        //this.User_message = message;
        this.User_image = image;
        this.User_age = age;
        this.User_name = name;
        this.User_ph_number = ph_number;
        this.User_address = address;
        this.User_sex = sex;



    }
}