package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Driver extends Person {
    private int driverID;
    private int licenseNo;
    private static final Logger logger = LogManager.getLogger(Driver.class);

    // ------------------------ Constructors -------------------------//
    public Driver() {
    }

    public Driver(String fullName, String address, String email) {
        super(fullName, address, email);
    }

    // ------------------------ Getters -------------------------//
    public int getDriverID() {
        return driverID;
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }

    // ------------------------ Setters -------------------------//
    public int getLicenseNo() {
        return licenseNo;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return getDriverID() == driver.getDriverID() && getLicenseNo() == driver.getLicenseNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDriverID(), getLicenseNo());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID=" + driverID +
                ", licenseNo=" + licenseNo +
                '}';
    }
}