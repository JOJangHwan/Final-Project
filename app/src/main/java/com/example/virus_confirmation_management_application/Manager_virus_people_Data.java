package com.example.virus_confirmation_management_application;

class Manager_virus_people_Data {

//item_layout에 들어갈 데이터


    String virus_message;    //item에 넣어질 메세지
    int virus_resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return virus_resourceId;
    }

    public Manager_virus_people_Data(int i) {
    }


    public String getMessage() {
        return virus_message;
    }


    public void setMessage(String message) {
        this.virus_message = message;
    }

    public void setResourceId(int resourceId) {
        this.virus_resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_virus_people_Data(int resourceId, String message) {
        this.virus_message = message;
        this.virus_resourceId = resourceId;

    }
}