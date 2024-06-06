package com.pack.entity;

public class Student {
    private int stid;
    private String stname;
    public Student(){}

    public Student(int stid, String stname) {
        this.stid = stid;
        this.stname = stname;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }
}