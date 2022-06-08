package com.example.virus_confirmation_management_application;

public class user_map_board_comment_item {

    private int index; //지역에 인덱스
    private String comment;
    //private String board_contents;
    private String user_id;
    private String board_date;


    public user_map_board_comment_item( int index, String comment, String user_id, String board_date) {
        this.index = index;
        this.comment = comment;
        this.user_id= user_id;
        this.board_date = board_date;
        }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBoard_date() {
        return board_date;
    }

    public void setBoard_date(String board_date) {
        this.board_date = board_date;
    }
}
