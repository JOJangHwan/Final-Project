package com.example.virus_confirmation_management_application;

class Manager_User_Data {

//item_layout에 들어갈 데이터


    String User_message;    //item에 넣어질 메세지
    int User_resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return User_resourceId;
    }

    public Manager_User_Data(int i) {
    }


    public String getMessage() {
        return User_message;
    }


    public void setMessage(String message) {
        this.User_message = message;
    }

    public void setResourceId(int resourceId) {
        this.User_resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_User_Data(int resourceId, String message) {
        this.User_message = message;
        this.User_resourceId = resourceId;

    }
}