package com.example.virus_confirmation_management_application;

public class user_map_boardlist_item {
    //private String boardlocation;

    private String index; //지역에 인덱스
    private String tittle;
    private String content;
    private String name;
    private String Time;
    private String chattingnum;

    public user_map_boardlist_item(){}




    public String getChattingnum() {
        return chattingnum;
    }

    public void setChattingnum(String chattingnum) {
        this.chattingnum = chattingnum;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
    //private int board_like_num;




}
