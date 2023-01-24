package com.solvd.delivery;

import com.solvd.delivery.interfaces.ITransportation;
import com.solvd.delivery.utils.Generator;
import com.solvd.delivery.utils.PrintValues;

public class Main extends Thread {
    public static <weight> void main(String[] args) {

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

        // Using Lambda Expression to get transportation way to ship the package
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

        System.out.println(iTransportation.transWay());
//        Example example = (x, y) -> x * y;
//        System.out.println(example.calc(3,5));

        // Using Thread
        // M m = new M();
        // m.run();
        //
    }
}