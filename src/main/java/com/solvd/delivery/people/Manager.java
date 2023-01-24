package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Manager extends Person {
    private int managerID;
    private String managerPosition;
    private double managerSalary;
    private static final Logger logger = LogManager.getLogger(Manager.class);

    // ------------------------ Constructors -------------------------//
    public Manager() {
    }

    public Manager(String fullName, String address, String email) {
        super(fullName, address, email);
    }

    public Manager(int managerID, String managerPosition, double managerSalary) {
        this.managerID = managerID;
        this.managerPosition = managerPosition;
        this.managerSalary = managerSalary;
    }

    // ------------------------ Getters -------------------------//
    public int getManagerID() {
        return managerID;
    }

    public String getManagerPosition() {
        return managerPosition;
    }

    public double getManagerSalary() {
        return managerSalary;
    }

    // ------------------------ Setters -------------------------//
    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public void setManagerPosition(String managerPosition) {
        this.managerPosition = managerPosition;
    }

    public void setManagerSalary(double managerSalary) {
        this.managerSalary = managerSalary;
    }
}
