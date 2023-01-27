package com.solvd.delivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Package {

    private int packageSerialNumber;
    private double packageWeight;
    private static final Logger logger = LogManager.getLogger(Package.class);

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

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Package)) return false;
        Package aPackage = (Package) o;
        return getPackageSerialNumber() == aPackage.getPackageSerialNumber() && Double.compare(aPackage.getPackageWeight(), getPackageWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPackageSerialNumber(), getPackageWeight());
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageSerialNumber=" + packageSerialNumber +
                ", packageWeight=" + packageWeight +
                '}';
    }
}
