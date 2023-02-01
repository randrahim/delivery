package com.solvd.delivery.interfaces;

@FunctionalInterface
public interface IShippingStatus {
    void isShipped(boolean shipped);
}
