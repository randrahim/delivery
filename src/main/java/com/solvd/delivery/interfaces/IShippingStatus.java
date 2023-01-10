package com.solvd.delivery.interfaces;

public interface IShippingStatus {
    String isShipped = "shipped";
    String isNotShipped = "not shipped yet.";
    void shipped();
}
