package com.solvd.delivery.payment;

import com.solvd.delivery.people.Generator;

import java.util.Objects;

public class Payment extends Product {
    private double total;
    Product products = new Product();
    Generator generator = new Generator();

    // ------------------------ Constructors -------------------------//
    public Payment() {
    }

    public Payment(Product products) {
        this.products = products;
    }

    public Payment(double total) {
        this.total = total;
    }

    public Payment(double total, Product products) {
        this.total = total;
        this.products = products;
    }

    // ------------------------ Getters -------------------------//

    public double getTotal(double theItemPrice, int quantity) {
        total = (theItemPrice + (theItemPrice * 0.06)) * quantity;
        return total;
    }

    public double getTotal() { return total; }

    public Product getProducts() {  return products; }

    // ------------------------ Setters -------------------------//
    public void setTotal(double total) {
        this.total = total;
    }

    public void setProducts(Product products) {  this.products = products; }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.getTotal(), getTotal()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTotal());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "total=" + total +
                '}';
    }
}