package com.solvd.delivery;

import com.solvd.delivery.utils.Logger;

public class Main extends Thread {
    public static void main(String[] args) {
        // Using Logger to print out the values from Generator class
        Logger logger = new Logger();
        logger.printManager();
        logger.printEmployee();
        logger.printCustomer();

        logger.printProduct();
        logger.printPackage();
        logger.printNotifications();
        logger.printEnums();

        // Using Thread
        // M m = new M();
        // m.run();
        //
    }
}