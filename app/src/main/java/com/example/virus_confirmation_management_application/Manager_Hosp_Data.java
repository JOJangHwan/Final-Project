/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;
/*

2017243053 조장환

 */
class Manager_Hosp_Data {

//item_layout에 들어갈 데이터

    int Hosp_image;// 사진
    String Hosp_name;//item에 넣어질 메세지
    String Hosp_address;    //item에 넣어질 메세지
    String Hosp_number;    //item에 넣어질 메세지
    String Hosp_ing;    //item에 넣어질 메세지
    String Hosp_target;    //item에 넣어질 메세지



    public int getHosp_image() {
        return Hosp_image;
    }

    public Manager_Hosp_Data(int i) {
    }


    public String getHosp_name() {
        return Hosp_name;
    }
    public String getHosp_address() {
        return Hosp_address;
    }
    public String getHosp_number() {
        return Hosp_number;
    }
    public String getHosp_ing() {
        return Hosp_ing;
    }
    public String getHosp_target() {
        return Hosp_target;
    }


    public void setHosp_name(String hosp_name) {
        this.Hosp_name = hosp_name;
    }
    public void setHosp_address(String hosp_address) {
        this.Hosp_address = hosp_address;
    }
    public void setHosp_number(String hosp_number) {
        this.Hosp_number = hosp_number;
    }
    public void setHosp_ing(String hosp_ing) {
        this.Hosp_ing = hosp_ing;
    }
    public void setHosp_target(String hosp_target) {
        this.Hosp_target = hosp_target;
    }


    public void setHosp_image(int hosp_image) {
        this.Hosp_image = hosp_image;
    }



    //constructor 만들기
    public Manager_Hosp_Data(int image, String name, String address,String number, String ing, String target) {
        this.Hosp_name = name;
        this.Hosp_address = address;
        this.Hosp_number = number;
        this.Hosp_ing = ing;
        this.Hosp_target = target;
        this.Hosp_image = image;

    }
}