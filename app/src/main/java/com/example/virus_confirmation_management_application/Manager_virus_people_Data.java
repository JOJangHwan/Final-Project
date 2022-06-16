/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

class Manager_virus_people_Data {

//item_layout에 들어갈 데이터


    private String Viruser_age;
    private String Viruser_address;
    private String Viruser_ph_number;
    private String Viruser_name;
    private String Viruser_sex;
    private int Viruser_image;


    public int getViruser_image() {
        return Viruser_image;
    }

    public String getViruser_age() {return Viruser_age;}
    public String getViruser_name() {
        return Viruser_name;
    }
    public String getViruser_address() {
        return Viruser_address;
    }
    public String getViruser_sex() {
        return Viruser_sex;
    }
    public String getViruser_ph_number() {return Viruser_ph_number;}


    public void setViruser(String Viruser_age) {this.Viruser_age = Viruser_age;}
    public void setViruser_name(String Viruser_name) {this.Viruser_name = Viruser_name;}
    public void setViruser_ph_number(String Viruser_ph_number) {this.Viruser_ph_number = Viruser_ph_number;}
    public void setViruser_area(String Viruser_address) {this.Viruser_address = Viruser_address;}
    public void setViruser_sex(String Viruser_sex) {this.Viruser_sex = Viruser_sex;}
    public void setViruser_image(int Viruser_image) {this.Viruser_image = Viruser_image;}







    //constructor 만들기
    public Manager_virus_people_Data(int image, String name,String age,String ph_number,String sex,String address) {
        this.Viruser_image = image;
        this.Viruser_age = age;
        this.Viruser_name = name;
        this.Viruser_ph_number = ph_number;
        this.Viruser_address = address;
        this.Viruser_sex = sex;

    }
}