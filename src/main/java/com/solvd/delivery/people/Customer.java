package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Customer extends Person {
    private int customerID;
    private boolean isMember;
    private static final Logger logger = LogManager.getLogger(Customer.class);

    // ------------------------ Constructors ----------------------------------------------------------//
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

    // ------------------------ Getters ---------------------------------------------------------------//
    public int getCustomerID() {
        return customerID;
    }

    public boolean isMember() {
        return isMember;
    }

    // ------------------------ Setters ---------------------------------------------------------------//
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getCustomerID() == customer.getCustomerID() && isMember() == customer.isMember();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerID(), isMember());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", isMember=" + isMember +
                '}';
    }
}