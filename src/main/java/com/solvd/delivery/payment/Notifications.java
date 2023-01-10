package com.solvd.delivery.payment;

import com.solvd.delivery.interfaces.ISendMsgStatus;
import com.solvd.delivery.interfaces.IShippingDestination;
import com.solvd.delivery.interfaces.IShippingStatus;
import com.solvd.delivery.interfaces.ITrackingPackage;

public class Notifications implements IShippingStatus, IShippingDestination, ITrackingPackage, ISendMsgStatus {
    private String delivery;

    // ------------------------ Constructors -------------------------//
    public Notifications() {
    }

    public Notifications(String delivery) {
        this.delivery = delivery;
    }


    // ------------------------ Getters -------------------------//
    public String getDelivery() {
        return delivery;
    }

    // ------------------------ Setters -------------------------//
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }


    // ------------------------ @Override -------------------------//
    @Override
    public void shipped() {
        System.out.println("Your package is: " + isShipped);
    }

    @Override
    public void destination() {
        System.out.println("The package shipped to: " + toHome);
    }

    @Override
    public void tracking() {
        System.out.println("Your tracking number is: 568423971");
    }

    @Override
    public void sendMsgStatus() {
        System.out.println("Your package is at City, State (1).");
    }
}
