package com.company.cheesemvc.Models;

public class Enthusiast {
    /*
    *   Fields
    */
    private String username;
    private String email;
    private String password;
    private int id;
    private static int nextId = 1000000;
    /*
    *   Constructors
    */
    public Enthusiast(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public Enthusiast(){
        this.id = nextId;
        nextId++;
    }
    /*
    *   Getters and Setters
    */
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getId() { return id; }
    private void setId(int id) { this.id = id; }

    public static int getNextId() { return nextId; }
    private static void setNextId(int nextId) { Enthusiast.nextId = nextId; }
    /*
    *   Instance Methods
    */
}
