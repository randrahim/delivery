package com.solvd.delivery.people;

import com.solvd.delivery.enums.*;
import com.solvd.delivery.payment.Package;
import com.solvd.delivery.payment.Payment;
import com.solvd.delivery.payment.Product;
import com.solvd.delivery.shippingMethods.ShippingMethod;

public class Generator {

    public Employee generatorEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeID(333);
        employee.setEmployeePosition("Developer");
        employee.setEmployeeSalary(55000);
        employee.setFullName("Jack Smith");
        employee.setAddress("30 Peachtree Street, Alpharetta, GA 30075");
        employee.setEmail("employee@gmail.com");
        return employee;
    }

    public Customer generatorCustomer() {
        Customer customer = new Customer();
        customer.setCustomerID(222);
        customer.setFullName("Rand Rahim");
        customer.setAddress("20 Pleasant Hill, Duluth, GA 30030");
        customer.setEmail("customer@gmail.com");
        customer.setMember(true);
        return customer;
    }

    public Product generatorProduct() {
        Product product = new Product();
        product.setItem("Coach");
        product.setPrice(10);
        product.setQuantity(2);
        return product;
    }

    public Payment generatorPayment() {
        Payment payment = new Payment();
        double itemPrice = generatorProduct().getPrice();
        int quantity = generatorProduct().getQuantity();
        payment.getTotal(itemPrice, quantity);
        return payment;
    }

    public Package generatorPackage() {
        Package Package = new Package();
        Package.setPackageSerialNumber(11234);
        Package.setPackageWeight(10);
        return Package;
    }

//  Get information from Enums classes ----------------------------------------------------------
    public CustomerServiceRating generatorCustomerServiceRating() {
        //Using Enum to show the customer's satisfaction rate about the customer service.
        CustomerServiceRating myCustomerServiceRating = CustomerServiceRating.SATISFIED;
        return myCustomerServiceRating;
    }

    public DeliveryServiceRating generatorDeliveryServiceRating() {
        //Using Enum to show the customer's satisfaction rate about the delivery service.
        DeliveryServiceRating myDeliveryServiceRating = DeliveryServiceRating.GOOD;
        return myDeliveryServiceRating;
    }

    public ShippingMethod generatorDeliveryWay() {
        ShippingMethod shippingMethod = new ShippingMethod();
        shippingMethod.setDeliveryWay(DeliveryWay.STANDARD);
        shippingMethod.setCost(7.0);
        return shippingMethod;
    }

    public PaymentMethod generatorPaymentMethod() {
        PaymentMethod paymentMethod = PaymentMethod.DEBIT;
        return paymentMethod;
    }

    public Recommendation generatorRecommendation() {
        //Using Enum to show how much the user recommend our company to a friend
        Recommendation myRecommendation = Recommendation.LOW;
        return myRecommendation;
    }

    public ShippingStatus generatorShippingStatus() {
        ShippingStatus shippingStatus = ShippingStatus.SHIPPED;
        return shippingStatus;
    }
}
