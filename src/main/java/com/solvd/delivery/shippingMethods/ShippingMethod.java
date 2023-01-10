package com.solvd.delivery.shippingMethods;

import com.solvd.delivery.enums.DeliveryWay;
import com.solvd.delivery.interfaces.IShippingDestination;

public class ShippingMethod implements IShippingDestination {

    private double cost;
    private DeliveryWay deliveryWay;

    // ------------------------ Constructors -------------------------//
    public ShippingMethod() { }

    public ShippingMethod(double cost) { this.cost = cost; }

    public ShippingMethod(DeliveryWay deliveryWay) { this.deliveryWay = deliveryWay; }

    public ShippingMethod(double cost, DeliveryWay deliveryWay) {
        this.cost = cost;
        this.deliveryWay = deliveryWay;
    }

    // ------------------------ Getters -------------------------//

    public double getCost() {
        return cost;
    }

    public DeliveryWay getDeliveryWay() {
        return deliveryWay;
    }

    // ------------------------ Setters -------------------------//

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDeliveryWay(DeliveryWay deliveryWay) {
        this.deliveryWay = deliveryWay;
    }

    // ------------------------ @Override -------------------------//
    @Override
    public void destination() {
        System.out.println("Your package has been shipped to " + toHome);
    }
}



