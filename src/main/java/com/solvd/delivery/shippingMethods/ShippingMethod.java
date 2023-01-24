package com.solvd.delivery.shippingMethods;

import com.solvd.delivery.enums.DeliverySpeed;
import com.solvd.delivery.interfaces.IDistance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class ShippingMethod implements IDistance {

    private double cost;
    private DeliverySpeed deliverySpeed;
    private static final Logger logger = LogManager.getLogger(ShippingMethod.class);

    // ------------------------ Constructors -------------------------//
    public ShippingMethod() { }

    public ShippingMethod(double cost) { this.cost = cost; }

    public ShippingMethod(DeliverySpeed deliverySpeed) { this.deliverySpeed = deliverySpeed; }

    public ShippingMethod(double cost, DeliverySpeed deliverySpeed) {
        this.cost = cost;
        this.deliverySpeed = deliverySpeed;
    }

    // ------------------------ Getters -------------------------//

    public double getCost() {
        return cost;
    }

    public DeliverySpeed getDeliveryWay() {
        return deliverySpeed;
    }

    // ------------------------ Setters -------------------------//

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDeliveryWay(DeliverySpeed deliverySpeed) {
        this.deliverySpeed = deliverySpeed;
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
                ", deliverySpeed=" + deliverySpeed +
                '}';
    }
}



