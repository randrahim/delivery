package com.solvd.delivery.enums;

public enum DeliveryServiceRating {
    BAD(0, 4),
    GOOD(5,7),
    SATISFIED(8, 10);

    private int rating;
    private int overallSatisfaction;

    // ------------------------ Constructors -------------------------//
    DeliveryServiceRating() {
    }

    DeliveryServiceRating(int rating) {
        this.rating = rating;
    }

    DeliveryServiceRating(int rating, int overallSatisfaction) {
        this.rating = rating;
        this.overallSatisfaction = overallSatisfaction;
    }

    // ------------------------ Getters -------------------------//
    public int getRating() {
        return rating;
    }

    public int getOverallSatisfaction() {
        return overallSatisfaction;
    }
}
