package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Employee extends Person {
    private int employeeID;
    private String employeePosition;
    private double employeeSalary;
    private static final Logger logger = LogManager.getLogger(Employee.class);

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

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeID() == employee.getEmployeeID() && Double.compare(employee.getEmployeeSalary(), getEmployeeSalary()) == 0 && getEmployeePosition().equals(employee.getEmployeePosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeID(), getEmployeePosition(), getEmployeeSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}