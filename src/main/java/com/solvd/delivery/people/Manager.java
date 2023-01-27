package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

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

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return getManagerID() == manager.getManagerID() && Double.compare(manager.getManagerSalary(), getManagerSalary()) == 0 && getManagerPosition().equals(manager.getManagerPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManagerID(), getManagerPosition(), getManagerSalary());
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerID=" + managerID +
                ", managerPosition='" + managerPosition + '\'' +
                ", managerSalary=" + managerSalary +
                '}';
    }
}
