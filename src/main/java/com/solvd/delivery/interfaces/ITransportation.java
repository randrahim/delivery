package com.solvd.delivery.interfaces;

//@FunctionalInterface
public interface ITransportation {

    static void myMethod(int x, int y) {
        int total = x + y;
        System.out.println("The total is: " + total);
    }

    void myMethod();

//    void myMethod();
//    Generator generator = new Generator();
//    double thePackageWeight = generator.generatorPackage().getPackageWeight();
//
//    void transportationWay(double thePackageWeight) {
//        String transportation;
//        if ((0 <= thePackageWeight) && (thePackageWeight <= 10)) {
//            transportation = "Truck";
//        } else if ((11 <= thePackageWeight) && (thePackageWeight <= 20)) {
//            transportation = "Train";
//        } else if ((21 <= thePackageWeight) && (thePackageWeight <= 30)) {
//            transportation = "Ship";
//        } else if (31 <= thePackageWeight) {
//            transportation = "Airplane";
//        }
//        return transportation;
//    }
}
