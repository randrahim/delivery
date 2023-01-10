package com.solvd.delivery;

import com.solvd.delivery.lambda.Discount;
import com.solvd.delivery.lambda.InsuranceRate;
import com.solvd.delivery.lambda.Places;
import com.solvd.delivery.payment.Notifications;
import com.solvd.delivery.payment.Payment;
import com.solvd.delivery.payment.Transportation;
import com.solvd.delivery.people.Generator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//  Get information from Generator --------------------
    Generator generator = new Generator();
    Payment payment = new Payment();
    System.out.println("\n");

System.out.println("----------------- Employee information -----------------------------------");
        System.out.println("Employee ID: " + generator.generatorEmployee().getEmployeeID());
        System.out.println("Employee Full Name: " + generator.generatorEmployee().getFullName());
        System.out.println("Employee Address: " + generator.generatorEmployee().getAddress());
        System.out.println("Employee Email: " + generator.generatorEmployee().getEmail());
        System.out.println("Employee Position: " + generator.generatorEmployee().getEmployeePosition());
        System.out.println("Employee Salary: " + generator.generatorEmployee().getEmployeeSalary() + "\n");

System.out.println("----------------- Customer information -----------------------------------");
     System.out.println("Customer ID: " + generator.generatorCustomer().getCustomerID());
     System.out.println("Customer Full Name: " + generator.generatorCustomer().getFullName());
     System.out.println("Customer Address: " + generator.generatorCustomer().getAddress());
     System.out.println("Customer Email: " + generator.generatorCustomer().getEmail());
     boolean customerIsMember = generator.generatorCustomer().isMember();
     System.out.println("Customer Membership: " + generator.generatorCustomer().isMember() + "\n");

System.out.println("----------------- The Order Summary -------------------------------------------");
        System.out.println("The purchase item is: " + generator.generatorProduct().getItem());
        double theItemPrice = generator.generatorProduct().getPrice();
        double itemPrice = generator.generatorProduct().getPrice();
        System.out.println("The item price is: " + theItemPrice);
        int quantity = generator.generatorProduct().getQuantity();
        System.out.println("The quantity is: " + quantity + "\n");

        System.out.println("Customer Payment method is: " + generator.generatorPaymentMethod().getPaymentMethod());
        System.out.println("Customer Payment method fee is: " + generator.generatorPaymentMethod().getFee() + "\n");

        System.out.println("The Shipping method is: " + generator.generatorDeliveryWay().getDeliveryWay());
        System.out.println("The Shipping method fee is: " + generator.generatorDeliveryWay().getDeliveryWay().getExtraFee());
        System.out.println("Your package will arrive within: " + generator.generatorDeliveryWay().getDeliveryWay().getDaysAmount() + " days.\n");

        double totalPayment = payment.getTotal(theItemPrice, quantity) + generator.generatorPaymentMethod().getFee() + generator.generatorDeliveryWay().getDeliveryWay().getExtraFee();
        System.out.println("The total payment is: " + totalPayment + "\n");

System.out.println("----------------- The order shipping status -----------------------------------");
        double thePackageWeight = generator.generatorPackage().getPackageWeight();
        // Decide what Transportation Way (Truck, Train, Ship, Airplane)
        Transportation transportation = new Transportation();
        System.out.println("The package shipped by " + transportation.getTransportation(thePackageWeight));
        System.out.println(generator.generatorShippingStatus() + "\n");

System.out.println("----------------- Send Notifications to Customer ---------------------------");
        Notifications notifications = new Notifications();
        notifications.shipped();
        notifications.destination();
        notifications.tracking();
        notifications.sendMsgStatus();
        System.out.println("\n");

System.out.println("----------------- Enums Classes --------------------------------------------");
        System.out.println("I would recommend your company to a friend: " + generator.generatorRecommendation());
        System.out.println("My rating about the overall delivery service: " + generator.generatorDeliveryServiceRating());
        System.out.println("My rating about the overall customer service: " + generator.generatorCustomerServiceRating() + "\n");

System.out.println("----------------- Lambda Classes -------------------------------------------");
        // Using Lambda to show where we can deliver or ship our products.
        List<String> myPlaces = Places.getPlaces();
        System.out.println("We ship to: " + myPlaces);
        // Using Lambda to show different insurance rate.
        List<String> myInsuranceRate = InsuranceRate.getInsuranceRate();
        System.out.println("Our insurance rate list: " + myInsuranceRate + "$.");
        // Using Lambda to show different discounts offers.
        List<Double> myDiscount = Discount.getDiscount();
        System.out.println("We hav 5%, 10%, 20%, and 30% discount: " + myDiscount + "\n");

System.out.println("----------------- Shipping Method Classes -------------------------------------------");

//   Get Items and price from Generator --------------------




//System.out.println("----------------------------------- M Classes -------------------------------------------");
//    WordCount wordCount = new WordCount();
//    System.out.println(wordCount);
    }
}
