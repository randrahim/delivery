package com.solvd.delivery;

import com.solvd.delivery.interfaces.ICart;
import com.solvd.delivery.interfaces.ITransportation;
import com.solvd.delivery.utils.Generator;
import com.solvd.delivery.utils.PrintValues;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.solvd.delivery.utils.Generator.generatorProduct;

public class Main extends Thread {
    private static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        // Using PrintValues to print out the values from Generator class
        Generator generator = new Generator();
        PrintValues printValues = new PrintValues();

        printValues.printManager();
        printValues.printEmployee();
        printValues.printCustomer();

        printValues.printProduct();
        printValues.printPackage();
        printValues.printNotifications();
        printValues.printEnums();

        double thePackageWeight = generator.generatorPackage().getPackageWeight();
        System.out.println("The package weight is: " + thePackageWeight);

        // Using Lambda Expression & Functional Interface to get transportation way to ship the package
        // Decide what Transportation Way (Truck, Train, Ship, Airplane) based on the PackageWeight
        ITransportation iTransportation = () -> {
            String transportation = "";
            if ((0 <= thePackageWeight) && (thePackageWeight <= 10)) {
                transportation = "Truck";
                printValues.printTruck();
            } else if ((11 <= thePackageWeight) && (thePackageWeight <= 20)) {
                transportation = "Train";
                printValues.printTrain();
            } else if ((21 <= thePackageWeight) && (thePackageWeight <= 30)) {
                transportation = "The transportation way is Ship";
                printValues.printShip();
            } else if (31 <= thePackageWeight) {
                transportation = "Airplane";
                printValues.printAirplane();
            }
            return transportation;
        };

        logger.error(iTransportation.transWay());

        // Using Lambda Expression & Functional Interface to get the Total Payment
        double theItemPrice = generatorProduct().getPrice();
        int quantity = generator.generatorProduct().getQuantity();

        ICart iCart = () -> {
            double total = (theItemPrice + (theItemPrice * 0.06)) * quantity;
            return total;
        };
        logger.error("The total payment is: " + iCart.totalPayment());
    }
}
