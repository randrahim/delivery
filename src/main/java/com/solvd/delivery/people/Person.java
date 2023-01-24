package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Person {
    private String fullName;
    private String address;
    private String email;
    private static final Logger logger = LogManager.getLogger(Person.class);

    // ------------------------ Constructors -------------------------//
    public Person() {
    }

    public Person(String fullName, String address, String email) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
    }

    // ------------------------ Setters -------------------------//
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ------------------------ Getters -------------------------//
    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
