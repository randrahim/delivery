package com.solvd.delivery.interfaces;

@FunctionalInterface
public interface IShippingStatus {
//    String isShipped = "shipped";
//    String isNotShipped = "not shipped yet.";
    void isShipped(boolean shipped);
}
