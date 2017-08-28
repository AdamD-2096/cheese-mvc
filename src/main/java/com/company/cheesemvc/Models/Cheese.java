package com.company.cheesemvc.Models;

public class Cheese {
    private String name;
    private String info;
    private int id;
    private static int nextID = 1;

    public Cheese(String aName, String aInfo) {
        this.name = aName;
        this.info = aInfo;
        this.id = nextID;
        nextID++;
    }
    public Cheese(String aName) {
        this(aName, "");
    }
    public Cheese(){this("");}

    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public String getInfo() {
        return this.info;
    }
    public void setInfo(String aInfo) {
        this.info = aInfo;
    }

    public int getId() { return id; }
    private void setId(int id) { this.id = id; }

    public static int getNextID() { return nextID; }
    private static void setNextID(int nextID) { Cheese.nextID = nextID; }
}