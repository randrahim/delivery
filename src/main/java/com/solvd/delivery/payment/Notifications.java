package com.solvd.delivery.payment;

import com.solvd.delivery.interfaces.ISendMsgStatus;
import com.solvd.delivery.interfaces.ITrackingPackage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Notifications implements ITrackingPackage, ISendMsgStatus {
    private String delivery;
    private static final Logger logger = LogManager.getLogger(Notifications.class);

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
    public void tracking() {
        System.out.println("Your tracking number is: 568423971");
    }

    @Override
    public void sendMsgStatus() {
        System.out.println("Your package is at City, State (1).");
    }
}
