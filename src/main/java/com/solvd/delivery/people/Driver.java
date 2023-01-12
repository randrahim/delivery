package com.solvd.delivery.people;

public class Driver extends Person {
    private int driverID;
    private int licenseNo;

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
}
