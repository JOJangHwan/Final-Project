package com.example.virus_confirmation_management_application;

public class Manager_viruslist_Data {
    private int img_viruslist_pelple;
    private String text_vruslist_name;
    private String text_vruslist_age;


    public Manager_viruslist_Data(int img_viruslist_pelple, String text_vruslist_name, String text_vruslist_age) {
        this.img_viruslist_pelple = img_viruslist_pelple;
        this.text_vruslist_name = text_vruslist_name;
        this.text_vruslist_age = text_vruslist_age;
    }


    public int getImg_viruslist_pelple() {
        return img_viruslist_pelple;
    }

    public String getText_vruslist_name() {
        return text_vruslist_name;
    }

    public void setText_vruslist_name(String text_vruslist_name) {
        this.text_vruslist_name = text_vruslist_name;
    }

    public String getText_vruslist_age() {
        return text_vruslist_age;
    }

    public void setText_vruslist_age(String text_vruslist_age) {
        this.text_vruslist_age = text_vruslist_age;
    }

    public void setImg_viruslist_pelple(int img_viruslist_pelple) {
        this.img_viruslist_pelple = img_viruslist_pelple;
    }
}
