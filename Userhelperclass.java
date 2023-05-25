package com.example.educationapp;

public class Userhelperclass {
    String name,email,uname,password;
    public Userhelperclass(String name, String email, String uname, String password) {
        this.name=name;
        this.email=email;
        this.uname=uname;
        this.password=password;

    }
    public Userhelperclass(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
