package com.solvd.delivery.enums;

public enum DeliverySpeed {
    FAST("Fast delivery", 3, 1.5, 7.0),
    STANDARD("Standard delivery", 10, 1.1, 0.0);

    private String deliveryWay;
    private int DaysAmount;
    private double coefficient;
    private double extraFee;

    // ------------------------ Constructors -------------------------//

    DeliverySpeed() {
    }

    DeliverySpeed(String deliveryWay, int daysAmount, double coefficient, double extraFee) {
        this.deliveryWay = deliveryWay;
        DaysAmount = daysAmount;
        this.coefficient = coefficient;
        this.extraFee = extraFee;
    }

    // ------------------------ Getters -------------------------//
    public String getDeliveryWay() {
        return deliveryWay;
    }

    public int getDaysAmount() {
        return DaysAmount;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public double getExtraFee() { return extraFee; }
}
