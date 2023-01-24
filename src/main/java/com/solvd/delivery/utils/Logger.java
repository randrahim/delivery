package com.solvd.delivery.utils;

import com.solvd.delivery.payment.Notifications;
import com.solvd.delivery.payment.Payment;
import org.apache.logging.log4j.LogManager;

public class Logger {
    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Logger.class);
//    private static final Logger logger = LogManager.getLogger(Logger.class);

    public static void printManager() {
        Generator generator = new Generator();
        System.out.println("----------------- Manager information -----------------------------------");
        logger.error("Manager ID: " + generator.generatorManager().getManagerID());
        logger.error("Manager Full Name: " + generator.generatorManager().getFullName());
        logger.error("Manager Address: " + generator.generatorManager().getAddress());
        logger.error("Manager Email: " + generator.generatorManager().getEmail());
        logger.error("Manager Position: " + generator.generatorManager().getManagerPosition());
        logger.error("Manager Salary: " + generator.generatorManager().getManagerSalary() + "\n");
    }

    public static void printEmployee() {
        Generator generator = new Generator();
        System.out.println("----------------- Employee information -----------------------------------");
        logger.error("Employee ID: " + generator.generatorEmployee().getEmployeeID());
        logger.error("Employee Full Name: " + generator.generatorEmployee().getFullName());
        logger.error("Employee Address: " + generator.generatorEmployee().getAddress());
        logger.error("Employee Email: " + generator.generatorEmployee().getEmail());
        logger.error("Employee Position: " + generator.generatorEmployee().getEmployeePosition());
        logger.error("Employee Salary: " + generator.generatorEmployee().getEmployeeSalary() + "\n");
    }

    public static void printCustomer() {
        Generator generator = new Generator();
        System.out.println("----------------- Customer information -----------------------------------");
        logger.error("Customer ID: " + generator.generatorCustomer().getCustomerID());
        logger.error("Customer Full Name: " + generator.generatorCustomer().getFullName());
        logger.error("Customer Address: " + generator.generatorCustomer().getAddress());
        logger.error("Customer Email: " + generator.generatorCustomer().getEmail());
        boolean customerIsMember = generator.generatorCustomer().isMember();
        logger.error("Customer Membership: " + generator.generatorCustomer().isMember() + "\n");
    }

    public static void printProduct() {
        Generator generator = new Generator();
        Payment payment = new Payment();
        System.out.println("----------------- The Order Summary -------------------------------------------");
        logger.error("The purchase item is: " + generator.generatorProduct().getItem());
        double theItemPrice = generator.generatorProduct().getPrice();
        double itemPrice = generator.generatorProduct().getPrice();
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
    public static void printPackage() {
        Generator generator = new Generator();
        System.out.println("----------------- The order shipping status -----------------------------------");
        double thePackageWeight = generator.generatorPackage().getPackageWeight();
        // Decide what Transportation Way (Truck, Train, Ship, Airplane)
//        Transportation transportation = new Transportation();
//        logger.error("The package shipped by " + transportation.getTransportation(thePackageWeight));
        logger.error(generator.generatorShippingStatus() + "\n");
    }
    public static void printNotifications() {
        Generator generator = new Generator();
        System.out.println("----------------- Send Notifications to Customer ---------------------------");
        Notifications notifications = new Notifications();
        notifications.isShipped(true);
        notifications.tracking();
        notifications.sendMsgStatus();
        logger.error("\n");
    }
    public static void printEnums() {
        Generator generator = new Generator();
        System.out.println("----------------- Enums Classes --------------------------------------------");
        logger.error("My rating about the overall delivery service: " + generator.generatorDeliveryServiceRating());
        logger.error("My rating about the overall customer service: " + generator.generatorCustomerServiceRating() + "\n");
    }

    public static void printLambda() {
        Generator generator = new Generator();
        System.out.println("----------------- Lambda Classes -------------------------------------------");

        generator.generatorIDistance();
        generator.generatorIShippingStatus();
    }
    public static void printEqualsHashToString() {
        Generator generator = new Generator();
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