package com.example.first_activity;

public class querydatabase {
    private int id;
    private String question;

    public querydatabase( int id , String question) {
        this.question = question;
        this.id = id;

    }

    public querydatabase() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "querydatabase{" +
                "id=" + id +
                ", question='" + question + '\'' +
                '}';
    }
}
