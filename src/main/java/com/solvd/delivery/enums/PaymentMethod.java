package com.solvd.delivery.enums;

public enum PaymentMethod {
    CREDIT("Credit", 0),
    DEBIT("Debit", 1.99),
    MASTER("Master", 2.99),
    PAYPAL("PayPal", 3.99);

    private String paymentMethod;
    private double fee;

    // ------------------------ Constructors -------------------------//
    PaymentMethod() {
    }

    PaymentMethod(double fee) {
        this.fee = fee;
    }

    PaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    PaymentMethod(String paymentMethod, double fee) {
        this.paymentMethod = paymentMethod;
        this.fee = fee;
    }

    // ------------------------ Getters -------------------------//
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getFee() {
        return fee;
    }

    // ------------------------ Setters -------------------------//
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}