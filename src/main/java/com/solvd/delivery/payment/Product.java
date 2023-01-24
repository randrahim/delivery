package com.solvd.delivery.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Product {
    private String item;
    private double price;
    private int quantity;
    private static final Logger logger = LogManager.getLogger(Product.class);

    // ------------------------ Constructors -------------------------//
    public Product() {
    }

    public Product(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    // ------------------------ Getters ------------------------------//
    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // ------------------------ Setters ------------------------------//
    public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && getQuantity() == product.getQuantity() && getItem().equals(product.getItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItem(), getPrice(), getQuantity());
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}