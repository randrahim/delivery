package com.solvd.delivery.utils;

import com.solvd.delivery.enums.*;
import com.solvd.delivery.interfaces.IDistance;
import com.solvd.delivery.payment.Package;
import com.solvd.delivery.payment.Payment;
import com.solvd.delivery.payment.Product;
import com.solvd.delivery.people.Customer;
import com.solvd.delivery.people.Employee;
import com.solvd.delivery.people.Manager;
import com.solvd.delivery.shippingMethods.ShippingMethod;
import com.solvd.delivery.transportations.Airplane;
import com.solvd.delivery.transportations.Ship;
import com.solvd.delivery.transportations.Train;
import com.solvd.delivery.transportations.Truck;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Generator {
    private static final Logger logger = LogManager.getLogger(Generator.class);
    // Getting the Manager information
    public static Manager generatorManager() {
        Manager manager = new Manager();
        manager.setManagerID(959);
        manager.setManagerPosition("Manager");
        manager.setManagerSalary(100000);
        manager.setFullName("Chris William");
        manager.setAddress("30 Lilburn Rd, Cummings, GA 30584");
        manager.setEmail("manager@gmail.com");
        return manager;
    }

    // Getting the Employee information
    public static Employee generatorEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeID(333);
        employee.setEmployeePosition("Developer");
        employee.setEmployeeSalary(55000);
        employee.setFullName("Jack Smith");
        employee.setAddress("10 Peachtree Street, Alpharetta, GA 30075");
        employee.setEmail("employee@gmail.com");
        return employee;
    }

    // Getting the Customer information
    public static Customer generatorCustomer() {
        Customer customer = new Customer();
        customer.setCustomerID(222);
        customer.setFullName("Rand Rahim");
        customer.setAddress("20 Pleasant Hill, Duluth, GA 30030");
        customer.setEmail("customer@gmail.com");
        customer.setMember(true);
        return customer;
    }

    // Getting the transportation information
    public static Train generatorTrain() {
        Train train = new Train();
        train.setTransportation("Train");
        train.setVehicleID(2564);
        train.setTrainName("Railrestro");
        train.setTrainType("Freight Trains");
        train.setWeightHold(18);
        train.setDateOfDepart("Jan-08-2021");
        train.setDateOfArrival("Jan-25-2021");
        return train;
    }

    public static Truck generatorTruck() {
        Truck truck = new Truck();
        truck.setTransportation("Truck");
        truck.setVehicleID(2564);
        truck.setTruckName("Freight liners");
        truck.setTruckType("Package Delivery Trucks");
        truck.setWeightHold(18);
        truck.setDateOfDepart("Jan-08-2021");
        truck.setDateOfArrival("Jan-25-2021");
        return truck;
    }

    public static Ship generatorShip() {
        Ship ship = new Ship();
        ship.setTransportation("Ship");
        ship.setVehicleID(2564);
        ship.setShipName("Cargo Ship");
        ship.setShipType("Delivery Ships");
        ship.setWeightHold(18);
        ship.setDateOfDepart("Jan-08-2021");
        ship.setDateOfArrival("Jan-25-2021");
        return ship;
    }

    public static Airplane generatorAirplane() {
        Airplane airplane = new Airplane();
        airplane.setTransportation("Airplane");
        airplane.setVehicleID(2564);
        airplane.setAirplaneName("Cargo Jet");
        airplane.setAirplaneType("Delivery Airplane");
        airplane.setWeightHold(18);
        airplane.setDateOfDepart("Jan-08-2021");
        airplane.setDateOfArrival("Jan-25-2021");
        return airplane;
    }

    // Getting the Product information
    public static Product generatorProduct() {
        Product product = new Product();
        product.setItem("Coach");
        product.setPrice(10);
        product.setQuantity(2);
        return product;
    }

    // Getting the Payment information
    public static Payment generatorPayment() {
        Payment payment = new Payment();
        double itemPrice = generatorProduct().getPrice();
        int quantity = generatorProduct().getQuantity();
        payment.getTotal(itemPrice, quantity);
        return payment;
    }

    // Getting the Package information
    public static Package generatorPackage() {
        Package Package = new Package();
        Package.setPackageSerialNumber(11234);
        Package.setPackageWeight(40);
        return Package;
    }

//  Get information from Enums classes ----------------------------------------------------------
    public static CustomerServiceRating generatorCustomerServiceRating() {
        //Using Enum to show the customer's satisfaction rate about the customer service.
        CustomerServiceRating myCustomerServiceRating = CustomerServiceRating.SATISFIED;
        return myCustomerServiceRating;
    }

    public static DeliveryServiceRating generatorDeliveryServiceRating() {
        //Using Enum to show the customer's satisfaction rate about the delivery service.
        DeliveryServiceRating myDeliveryServiceRating = DeliveryServiceRating.GOOD;
        return myDeliveryServiceRating;
    }

    public static ShippingMethod generatorDeliveryWay() {
        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.setDeliveryWay(DeliverySpeed.STANDARD);
        shippingMethod.setCost(7.0);
        return shippingMethod;
    }

    public static PaymentMethod generatorPaymentMethod() {
        PaymentMethod paymentMethod = PaymentMethod.DEBIT;
        return paymentMethod;
    }

    public static ShippingStatus generatorShippingStatus() {
        ShippingStatus shippingStatus = ShippingStatus.SHIPPED;
        return shippingStatus;
    }

// Using Lambda Expression
    public static IDistance generatorIDistance() {
        IDistance iDistance = (String source, String destination)-> System.out.println("The package shipped from " + source + " to "+ destination);
        iDistance.distance("Atlanta", "California");
        return iDistance;
    }

//    public static IShippingStatus generatorIShippingStatus() {
//        IShippingStatus iShippingStatus = (boolean shipped)-> {
//            String result =  (shipped == true) ? "The package is shipped" : "The package is not shipped yet.";
//            System.out.println(result);
//        };
//        iShippingStatus.isShipped(true);
//        return iShippingStatus;
//    }



}
