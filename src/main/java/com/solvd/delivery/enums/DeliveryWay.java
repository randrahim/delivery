package com.solvd.delivery.enums;

public enum DeliveryWay {
    FAST("Fast delivery", 3, 1.5, 7.0),
    STANDARD("Standard delivery", 10, 1.1, 0.0);

    private String deliveryWay;
    private int DaysAmount;
    private double coefficient;
    private double extraFee;

    // ------------------------ Constructors -------------------------//

    DeliveryWay() {
    }

    DeliveryWay(String deliveryWay, int daysAmount, double coefficient, double extraFee) {
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

    // ------------------------ Setters -------------------------//
    public void setDeliveryWay(String deliveryWay) {
        this.deliveryWay = deliveryWay;
    }

    public void setDaysAmount(int daysAmount) {
        DaysAmount = daysAmount;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public void setExtraFee(double extraFee) { this.extraFee = extraFee; }
}
