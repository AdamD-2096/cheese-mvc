package com.company.cheesemvc.Models;

public class Cheese {
    private String name;
    private String info;

    public Cheese(String aName, String aInfo) {
        this.name = aName;
        this.info = aInfo;
    }
    public Cheese(String aName) {
        this(aName, "");
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String aName) {
        this.name = aName;
    }
    public String getInfo() {
        return this.info;
    }

    protected void setInfo(String aInfo) {
        this.info = aInfo;
    }
}