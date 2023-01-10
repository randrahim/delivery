package com.solvd.delivery.people;

public class Customer extends Person {
    private int customerID;
    private boolean isMember;

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
