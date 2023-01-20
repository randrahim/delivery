package com.solvd.delivery.utils;

import com.solvd.delivery.enums.*;
import com.solvd.delivery.interfaces.IDistance;
import com.solvd.delivery.interfaces.IShippingStatus;
import com.solvd.delivery.payment.Package;
import com.solvd.delivery.payment.Payment;
import com.solvd.delivery.payment.Product;
import com.solvd.delivery.people.Customer;
import com.solvd.delivery.people.Employee;
import com.solvd.delivery.people.Manager;
import com.solvd.delivery.shippingMethods.ShippingMethod;

public class Generator {
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

    public static Customer generatorCustomer() {
        Customer customer = new Customer();
        customer.setCustomerID(222);
        customer.setFullName("Rand Rahim");
        customer.setAddress("20 Pleasant Hill, Duluth, GA 30030");
        customer.setEmail("customer@gmail.com");
        customer.setMember(true);
        return customer;
    }

    public static Product generatorProduct() {
        Product product = new Product();
        product.setItem("Coach");
        product.setPrice(10);
        product.setQuantity(2);
        return product;
    }

    public static Payment generatorPayment() {
        Payment payment = new Payment();
        double itemPrice = generatorProduct().getPrice();
        int quantity = generatorProduct().getQuantity();
        payment.getTotal(itemPrice, quantity);
        return payment;
    }

    public static Package generatorPackage() {
        Package Package = new Package();
        Package.setPackageSerialNumber(11234);
        Package.setPackageWeight(10);
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

    public static IShippingStatus generatorIShippingStatus() {
        IShippingStatus iShippingStatus = (boolean shipped)-> {
            String result =  (shipped == true) ? "The package is shipped" : "The package is not shipped yet.";
            System.out.println(result);
        };
        iShippingStatus.isShipped(true);
        return iShippingStatus;
    }
}
