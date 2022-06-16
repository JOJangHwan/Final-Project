/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

class Manager_Map_Data {

//item_layout에 들어갈 데이터


    String Map_message;    //item에 넣어질 메세지
    int map_date;
    int Map_resourceId;        //item에 넣어질 사진


    public int getResourceId() {
        return Map_resourceId;
    }

    public Manager_Map_Data(int i) {
    }


    public String getMessage() {
        return Map_message;
    }


    public void setMessage(String message) {
        this.Map_message = message;
    }

    public void setResourceId(int resourceId) {
        this.Map_resourceId = resourceId;
    }



    //constructor 만들기
    public Manager_Map_Data(int resourceId, String message) {
        this.Map_message = message;
        this.Map_resourceId = resourceId;

    }
}