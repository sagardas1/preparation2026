package com._6.preparation2026.java21.newFeature.records;

import java.util.Objects;

public class Person {

    String name;
    String phNumber;
    String address;
    Person() {
    }
    Person(String name, String phNumber, String address) {
        this.name = name;
        this.phNumber = phNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(phNumber, person.phNumber) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phNumber, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phNumber='" + phNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
