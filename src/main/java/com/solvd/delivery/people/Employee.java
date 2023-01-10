package com.solvd.delivery.people;

public class Employee extends Person {
    private int employeeID;
    private String employeePosition;
    private double employeeSalary;

    // ------------------------ Constructors -------------------------//
    public Employee() {
    }

    public Employee(int employeeID, String employeePosition, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public Employee(String fullName, String address, String email, Person person) {
        super(fullName, address, email);
    }

    // ------------------------ Setters -------------------------//
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    // ------------------------ Getters -------------------------//
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

}
