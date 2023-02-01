package com.solvd.delivery.enums;

public enum CustomerServiceRating {
    BAD(1, 2),
    GOOD(5, 7),
    SATISFIED(8,10);

    private int overallSatisfactionRange;
    private int overallSatisfactionDeliveryService;

    // ------------------------ Constructors -------------------------//
    CustomerServiceRating() {
    }

    CustomerServiceRating(int overallSatisfactionRange, int overallSatisfactionDeliveryService) {
        this.overallSatisfactionRange = overallSatisfactionRange;
        this.overallSatisfactionDeliveryService = overallSatisfactionDeliveryService;
    }    

    // ------------------------ Getters -------------------------//
    public int getOverallSatisfactionRange() {
        return overallSatisfactionRange;
    }

    public int getOverallSatisfactionDeliveryService() {
        return overallSatisfactionDeliveryService;
    }
}
