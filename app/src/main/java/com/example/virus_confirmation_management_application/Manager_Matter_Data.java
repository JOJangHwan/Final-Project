package com.example.virus_confirmation_management_application;

class Manager_Matter_Data {

//item_layout에 들어갈 데이터


    String Matter_message;    //item에 넣어질 메세지
    int Matter_resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return Matter_resourceId;
    }

    public Manager_Matter_Data(int i) {
    }


    public String getMessage() {
        return Matter_message;
    }


    public void setMessage(String message) {
        this.Matter_message = message;
    }

    public void setResourceId(int resourceId) {
        this.Matter_resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_Matter_Data(int resourceId, String message) {
        this.Matter_message = message;
        this.Matter_resourceId = resourceId;

    }
}