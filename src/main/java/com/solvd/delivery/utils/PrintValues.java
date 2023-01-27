package com.solvd.delivery.utils;

import com.solvd.delivery.payment.Notifications;
import com.solvd.delivery.payment.Payment;
import com.solvd.delivery.transportations.Airplane;
import com.solvd.delivery.transportations.Ship;
import com.solvd.delivery.transportations.Train;
import com.solvd.delivery.transportations.Truck;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrintValues {
    private Generator generator;
    private static Logger logger = LogManager.getLogger(PrintValues.class);

    public void printManager() {
        System.out.println("----------------- Manager information -----------------------------------");
        logger.error("Manager ID: " + generator.generatorManager().getManagerID());
        logger.error("Manager Full Name: " + generator.generatorManager().getFullName());
        logger.error("Manager Address: " + generator.generatorManager().getAddress());
        logger.error("Manager Email: " + generator.generatorManager().getEmail());
        logger.error("Manager Position: " + generator.generatorManager().getManagerPosition());
        logger.error("Manager Salary: " + generator.generatorManager().getManagerSalary() + "\n");
    }

    public void printEmployee() {
        System.out.println("----------------- Employee information -----------------------------------");
        logger.error("Employee ID: " + generator.generatorEmployee().getEmployeeID());
        logger.error("Employee Full Name: " + generator.generatorEmployee().getFullName());
        logger.error("Employee Address: " + generator.generatorEmployee().getAddress());
        logger.error("Employee Email: " + generator.generatorEmployee().getEmail());
        logger.error("Employee Position: " + generator.generatorEmployee().getEmployeePosition());
        logger.error("Employee Salary: " + generator.generatorEmployee().getEmployeeSalary() + "\n");
    }

    public void printCustomer() {
        System.out.println("----------------- Customer information -----------------------------------");
        logger.error("Customer ID: " + generator.generatorCustomer().getCustomerID());
        logger.error("Customer Full Name: " + generator.generatorCustomer().getFullName());
        logger.error("Customer Address: " + generator.generatorCustomer().getAddress());
        logger.error("Customer Email: " + generator.generatorCustomer().getEmail());
        boolean customerIsMember = generator.generatorCustomer().isMember();
        logger.error("Customer Membership: " + generator.generatorCustomer().isMember() + "\n");
    }

    public void printProduct() {
        Payment payment = new Payment();
        System.out.println("----------------- The Order Summary -------------------------------------------");
        logger.error("The purchase item is: " + generator.generatorProduct().getItem());
        double theItemPrice = generator.generatorProduct().getPrice();
        logger.error("The item price is: " + theItemPrice);
        int quantity = generator.generatorProduct().getQuantity();
        logger.error("The quantity is: " + quantity + "\n");

        logger.error("Customer Payment method is: " + generator.generatorPaymentMethod().getPaymentMethod());
        logger.error("Customer Payment method fee is: " + generator.generatorPaymentMethod().getFee() + "\n");

        logger.error("The Shipping method is: " + generator.generatorDeliveryWay().getDeliveryWay());
        logger.error("The Shipping method fee is: " + generator.generatorDeliveryWay().getDeliveryWay().getExtraFee());
        logger.error("Your package will arrive within: " + generator.generatorDeliveryWay().getDeliveryWay().getDaysAmount() + " days.\n");

        double totalPayment = payment.getTotal(theItemPrice, quantity) + generator.generatorPaymentMethod().getFee() + generator.generatorDeliveryWay().getDeliveryWay().getExtraFee();
        logger.error("The total payment is: " + totalPayment + "\n");
    }
    public void printPackage() {
        System.out.println("----------------- The order shipping status -----------------------------------");
        double thePackageWeight = generator.generatorPackage().getPackageWeight();
        logger.error(generator.generatorShippingStatus() + "\n");
    }
    public static void printNotifications() {
        System.out.println("----------------- Send Notifications to Customer ---------------------------");
        Notifications notifications = new Notifications();
//        notifications.isShipped(true);
        notifications.tracking();
        notifications.sendMsgStatus();
        logger.error("\n");
    }

    public void printShip() {
        System.out.println("----------------- Print Ship ---------------------------");
        Ship ship = new Ship();
        logger.error(generator.generatorShip().getTransportation());
        logger.error(generator.generatorShip().getVehicleID());
        logger.error(generator.generatorShip().getShipName());
        logger.error(generator.generatorShip().getShipType());
        logger.error(generator.generatorShip().getWeightHold());
        logger.error(generator.generatorShip().getDateOfDepart());
        logger.error(generator.generatorShip().getDateOfArrival());
    }

    public void printTruck() {
        Truck truck = new Truck();
        System.out.println("----------------- Print Ship ---------------------------");
        logger.error(generator.generatorTruck().getTransportation());
        logger.error(generator.generatorTruck().getVehicleID());
        logger.error(generator.generatorTruck().getTruckName());
        logger.error(generator.generatorTruck().getTruckType());
        logger.error(generator.generatorTruck().getWeightHold());
        logger.error(generator.generatorTruck().getDateOfDepart());
        logger.error(generator.generatorTruck().getDateOfArrival());
    }

    public void printTrain() {
        Train train = new Train();

        System.out.println("----------------- Print Ship ---------------------------");
        logger.error(generator.generatorTrain().getTransportation());
        logger.error(generator.generatorTrain().getVehicleID());
        logger.error(generator.generatorTrain().getTrainName());
        logger.error(generator.generatorTrain().getTrainType());
        logger.error(generator.generatorTrain().getWeightHold());
        logger.error(generator.generatorTrain().getDateOfDepart());
        logger.error(generator.generatorTrain().getDateOfArrival());
    }

    public void printAirplane() {
        Airplane airplane = new Airplane();

        System.out.println("----------------- Print Ship ---------------------------");
        logger.error(generator.generatorAirplane().getTransportation());
        logger.error(generator.generatorAirplane().getVehicleID());
        logger.error(generator.generatorAirplane().getAirplaneName());
        logger.error(generator.generatorAirplane().getAirplaneType());
        logger.error(generator.generatorAirplane().getWeightHold());
        logger.error(generator.generatorAirplane().getDateOfDepart());
        logger.error(generator.generatorAirplane().getDateOfArrival());
    }
    public void printEnums() {
        System.out.println("----------------- Enums Classes --------------------------------------------");
        logger.error("My rating about the overall delivery service: " + generator.generatorDeliveryServiceRating());
        logger.error("My rating about the overall customer service: " + generator.generatorCustomerServiceRating() + "\n");
    }

    public void printLambda() {
        System.out.println("----------------- Lambda Classes -------------------------------------------");
        generator.generatorIDistance();
//        generator.generatorIShippingStatus();
    }

    public void printEqualsHashToString() {
        Payment payment = new Payment();
        System.out.println("----------------- using equals, hashCode, toString ---------------------------");
        Payment payment2 = new Payment(24);
        logger.error(payment.equals(payment2));
        logger.error(payment.hashCode());
        logger.error(payment2.toString());
    }
    public static void printWordCount() {
//        WordCount wordCount = new WordCount();
//        logger.error(wordCount);
    }
}