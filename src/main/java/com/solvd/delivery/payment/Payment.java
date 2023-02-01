package com.solvd.delivery.payment;

import com.solvd.delivery.interfaces.ICart;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Payment extends Product implements ICart {
    private double total;
    private Product products;
    private static final Logger logger = LogManager.getLogger(Payment.class);

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
//        total = (theItemPrice + (theItemPrice * 0.06)) * quantity;
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

    @Override
    public double totalPayment() {
        return 0;
    }
}
