package com.example.virus_confirmation_management_application;

class Manager_QnA_Data {

//item_layout에 들어갈 데이터


    String QnAmessage;    //item에 넣어질 메세지
    int resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return resourceId;
    }

    public Manager_QnA_Data(int i) {
    }


    public String getMessage() {
        return QnAmessage;
    }


    public void setMessage(String message) {
        this.QnAmessage = message;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_QnA_Data(int resourceId,String message) {
        this.QnAmessage = message;
        this.resourceId = resourceId;

    }
}