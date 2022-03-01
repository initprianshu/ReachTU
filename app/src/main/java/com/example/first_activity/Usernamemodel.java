package com.example.first_activity;

public class Usernamemodel {
    private int id;
    private String uname;
    private String email;
    private int pin;

    public Usernamemodel(int id, String uname, String email, int pin) {
        this.id = id;
        this.uname = uname;
        this.email = email;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return uname;
    }

    public void setname(String uname) {
        this.uname = uname;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public int getpin() {
        return pin;
    }

    public void setpin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Usernamemodel{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", pin=" + pin +
                '}';
    }

    public Usernamemodel() {
    }
}
