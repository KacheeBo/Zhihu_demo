package com.example.demo.entity;

public class Creation {
    private int creatid;
    private String creator;
    private String title;
    private String time;

    public int getCreatid() {
        return creatid;
    }

    public void setCreatid(int creatid) {
        this.creatid = creatid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Creation{" +
                "creatid=" + creatid +
                ", creator='" + creator + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
