package com.example.virus_confirmation_management_application;
/*
    gramer : 윤승준  DB까지 개시판 구현 완료
 */
public class user_map_board_comment_item {


    private String content;
    private String name;
    private String Time;

    public user_map_board_comment_item(){}



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
}
