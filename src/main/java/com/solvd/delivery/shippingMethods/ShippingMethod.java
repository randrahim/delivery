package com.solvd.delivery.shippingMethods;

import com.solvd.delivery.enums.DeliveryWay;
import com.solvd.delivery.interfaces.IDistance;

import java.util.Objects;

public class ShippingMethod implements IDistance {

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
    public void distance(String source, String destination) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShippingMethod)) return false;
        ShippingMethod that = (ShippingMethod) o;
        return Double.compare(that.getCost(), getCost()) == 0 && getDeliveryWay() == that.getDeliveryWay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getDeliveryWay());
    }

    @Override
    public String toString() {
        return "ShippingMethod{" +
                "cost=" + cost +
                ", deliveryWay=" + deliveryWay +
                '}';
    }
}



