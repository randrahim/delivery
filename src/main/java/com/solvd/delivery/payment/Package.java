package com.solvd.delivery.payment;

public class Package {

    private int packageSerialNumber;
    private double packageWeight;

    // ------------------------ Constructors -------------------------//

    public Package() { }

    public Package(int packageSerialNumber) {
        this.packageSerialNumber = packageSerialNumber;
    }

    public Package(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public Package(int packageSerialNumber, double packageWeight) {
        this.packageSerialNumber = packageSerialNumber;
        this.packageWeight = packageWeight;
    }

    // ------------------------ Getters -------------------------//

    public int getPackageSerialNumber() {
        return packageSerialNumber;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    // ------------------------ Setters -------------------------//

    public void setPackageSerialNumber(int packageSerialNumber) {
        this.packageSerialNumber = packageSerialNumber;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }
}
