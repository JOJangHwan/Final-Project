package com.example.virus_confirmation_management_application;

class Manager_Notice_Data {

//item_layout에 들어갈 데이터


    String Notice_message;    //item에 넣어질 메세지
    int Notice_resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return Notice_resourceId;
    }

    public Manager_Notice_Data(int i) {
    }


    public String getMessage() {
        return Notice_message;
    }


    public void setMessage(String message) {
        this.Notice_message = message;
    }

    public void setResourceId(int resourceId) {
        this.Notice_resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_Notice_Data(int resourceId, String message) {
        this.Notice_message = message;
        this.Notice_resourceId = resourceId;

    }
}