package com.solvd.delivery;

import java.util.logging.Level;

public class Logger {
    private int x = 5;
    private int y = 2;
    private final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Logger.class.getName());

    String addition() {
        int total = x + y;
        LOGGER.log(Level.INFO, "The total is: " + total);
        return null;
    }
    java.util.logging.Logger myLog = java.util.logging.Logger.getLogger(Logger.class.getName());

    public void debug(String s) {
    }
//    myLog.log(Level.INFO, "The total is: " + Logger);
}
