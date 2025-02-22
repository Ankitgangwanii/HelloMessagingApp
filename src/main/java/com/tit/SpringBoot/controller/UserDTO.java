package com.tit.SpringBoot.controller;

public class UserDTO {
    private String firstName;
    private String lastName;

    //constructor
    public UserDTO() {
    }
    //getter and setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
