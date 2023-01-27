package com.solvd.delivery.enums;

public enum CustomerServiceRating {
    BAD(0, 4),
    GOOD(5, 7),
    SATISFIED(8,10);

    private int rating;
    private int overallSatisfaction;

    // ------------------------ Constructors -------------------------//
    CustomerServiceRating() {
    }

    CustomerServiceRating(int rating, int overallSatisfaction) {
        this.rating = rating;
        this.overallSatisfaction = overallSatisfaction;
    }

    // ------------------------ Setters -------------------------//
    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setOverallSatisfaction(int overallSatisfaction) {
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