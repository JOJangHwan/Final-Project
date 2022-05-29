package com.example.virus_confirmation_management_application;

class Manager_Hosp_Data {

//item_layout에 들어갈 데이터


    String Hosp_message;    //item에 넣어질 메세지
    int Hosp_resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return Hosp_resourceId;
    }

    public Manager_Hosp_Data(int i) {
    }


    public String getMessage() {
        return Hosp_message;
    }


    public void setMessage(String message) {
        this.Hosp_message = message;
    }

    public void setResourceId(int resourceId) {
        this.Hosp_resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_Hosp_Data(int resourceId, String message) {
        this.Hosp_message = message;
        this.Hosp_resourceId = resourceId;

    }
}