package com.example.virus_confirmation_management_application;
/*
    gramer : 윤승준 내부기능, UI
 */
public class user_stateItem {
    private String num;
    private String tittle;
    private String date;
    private String answercheck;

    public user_stateItem(String num, String tittle, String date,String answercheck) {
        this.num = num;
        this.tittle= tittle;
        this.date = date;
        this.answercheck=answercheck;
    }


    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAnswercheck() {
        return answercheck;
    }

    public void setAnswercheck(String answercheck) {
        this.answercheck = answercheck;
    }
}
