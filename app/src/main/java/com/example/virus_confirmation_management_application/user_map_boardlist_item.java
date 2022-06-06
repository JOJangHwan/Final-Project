package com.example.virus_confirmation_management_application;

public class user_map_boardlist_item {
    private String boardlocation;

    private int index; //지역에 인덱스
    private String board_tittle;
    //private String board_contents;
    private String user_id;
    private String board_date;
    private int board_chat_num;
    private int board_like_num;


    public user_map_boardlist_item(String boardlocation,int index, String board_tittle, String user_id, String board_date, int board_chat_num, int board_like_num) {
        this.boardlocation = boardlocation;
        this.index = index;
        this.board_tittle = board_tittle;
        this.user_id= user_id;
        this.board_date = board_date;
        this.board_chat_num=board_chat_num;
        this.board_like_num=board_like_num;
        }



    public String getBoardlocation() {
        return boardlocation;
    }

    public void setBoardlocation(String boardlocation) {
        this.boardlocation = boardlocation;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getBoard_tittle() {
        return board_tittle;
    }

    public void setBoard_tittle(String board_tittle) {
        this.board_tittle = board_tittle;
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

    public int getBoard_chat_num() {
        return board_chat_num;
    }

    public void setBoard_chat_num(int board_chat_num) {
        this.board_chat_num = board_chat_num;
    }

    public int getBoard_like_num() {
        return board_like_num;
    }

    public void setBoard_like_num(int board_like_num) {
        this.board_like_num = board_like_num;
    }













}
