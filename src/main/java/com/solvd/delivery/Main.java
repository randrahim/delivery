package com.solvd.delivery;

import com.solvd.delivery.utils.PrintValues;

public class Main extends Thread {
    public static void main(String[] args) {
        // Using PrintValues to print out the values from Generator class
        PrintValues printValues = new PrintValues();
        printValues.printManager();
        printValues.printEmployee();
        printValues.printCustomer();

        printValues.printProduct();
        printValues.printPackage();
        printValues.printNotifications();
        printValues.printEnums();

        // Using Thread
        // M m = new M();
        // m.run();
        //
    }
}