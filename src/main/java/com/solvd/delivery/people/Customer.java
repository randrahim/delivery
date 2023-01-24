package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer extends Person {
    private int customerID;
    private boolean isMember;
    private static final Logger logger = LogManager.getLogger(Customer.class);

    // ------------------------ Constructors -------------------------//
    public Customer() {
    }

    public Customer(int customerID) {
        this.customerID = customerID;
    }

    public Customer(boolean isMember) {
        this.isMember = isMember;
    }

    public Customer(String fullName, String address, String email, Person person) {
        super(fullName, address, email);
    }

    // ------------------------ Getters -------------------------//
    public int getCustomerID() {
        return customerID;
    }

    public boolean isMember() {
        return isMember;
    }

    // ------------------------ Setters -------------------------//
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}
