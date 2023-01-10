package com.solvd.delivery.payment;

public class Product {

    private String item;
    private double price;
    private int quantity;

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
}

//    String items[] = {"Apple", "Banana", "Cherry"};
//    double price[] = {1.99, 2.99, 3.99};


//    public Product(String[] items) {
//        this.items = items;
//    }
//
//    public Product(double[] price) {
//        this.price = price;
//    }
//
//    public int getNoOfPurchasedItems() {
//        noOfPurchasedItems =items.length;
//        return noOfPurchasedItems;
//    }

// ------------------------ Getters -------------------------//
//    public String[] getItems() {
//        for(int i=0; i<items.length; i++) {
//            System.out.println(items[i]);
//        }
//        return items;
//    }
//
//    public double[] getPrice() {
//        for(int i=0; i<price.length; i++) {
//            System.out.println(price[i]);
//        }
//        return price;
//    }

// ------------------------ Setters -------------------------//
//    public void setItems(String[] items) {
//        this.items = items;
//    }
//
//    public void setPrice(double[] price) {
//        this.price = price;
//    }
//
//    public void setItems(String item1) {
//    }
//
//    public void setPrice(double price1) {
//    }
