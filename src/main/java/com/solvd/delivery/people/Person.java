package com.solvd.delivery.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Person {
    private String fullName;
    private String address;
    private String email;
    private static final Logger logger = LogManager.getLogger(Person.class);

    // ------------------------ Constructors -------------------------//
    public Person() {
    }

    public Person(String fullName, String address, String email) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
    }

    // ------------------------ Setters -------------------------//
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ------------------------ Getters -------------------------//
    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    // ------------------------ Add Override equals(), hashCode(), toString() -------------------------//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFullName().equals(person.getFullName()) && getAddress().equals(person.getAddress()) && getEmail().equals(person.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getAddress(), getEmail());
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
