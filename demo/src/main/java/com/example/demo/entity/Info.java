package com.example.demo.entity;

public class Info {
    private int infoid;
    private String name;
    private int interest;

    public int getInfoid() {
        return infoid;
    }

    public void setInfoid(int infoid) {
        this.infoid = infoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interst) {
        this.interest = interst;
    }

    @Override
    public String toString() {
        return "Info{" +
                "infoid=" + infoid +
                ", name='" + name + '\'' +
                ", interest=" + interest +
                '}';
    }
}
