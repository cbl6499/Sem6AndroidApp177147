package com.example.clemensb.a177147;

/**
 * Created by ClemensB on 19.03.18.
 */

public class User {

    public String userName;
    public Integer score;


    public User(Integer s){
        score = s;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
