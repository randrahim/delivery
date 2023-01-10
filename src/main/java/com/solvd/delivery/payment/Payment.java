package com.solvd.delivery.payment;

import com.solvd.delivery.people.Generator;

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
    double theItemPrice = 10;
    int quantity = 2;
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
}



//    String[] purchasedItems = products.getItems();
//    double[] prices = products.getPrice();


//    public double getTotalPayment(List<Package> packages) {
//        packages.stream().Map(pack -> {
//        Product product = pack.getProduct();
//        do {
//            double[] priceOfProduct = product.getPrice();
//            if(priceOfProduct > 100) {
//                double fee = 10;
//            } else {
//                double fee = 0;
//            }
//        }
//        });
//        for(int i=0; i<prices.length; i++) {
//            total += prices[i];
//        }
//        totalPayment = total + (total * 0.06);
//        return totalPayment;
//    }
//
//    public double getTotal() {
//        return total;
//    }

//    public double getTotalPayment() {
//        for(int i=0; i<prices.length; i++) {
//            total += prices[i];
//        }
//        totalPayment = total + (total * 0.06);
//        return totalPayment;
//    }
//
//    public double getTotal() {
//        return total;
//    }