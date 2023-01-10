package com.solvd.delivery.enums;

public enum ShippingStatus {
    SHIPPED(true, "00123"),
    UNSHIPPED(false, "N/A");

    private boolean shipped;
    private String trackingNo;

    // ------------------------ Constructors -------------------------//
    ShippingStatus() {
    }

    ShippingStatus(boolean shipped, String trackingNo) {
        this.shipped = shipped;
        this.trackingNo = trackingNo;
    }

    // ------------------------ Getters -------------------------//
    public boolean isShipped() { return shipped; }

    public String getTrackingNo() { return trackingNo; }

    // ------------------------ Setters -------------------------//
    public void setShipped(boolean shipped) { this.shipped = shipped; }

    public void setTrackingNo(String trackingNo) { this.trackingNo = trackingNo; }
}
