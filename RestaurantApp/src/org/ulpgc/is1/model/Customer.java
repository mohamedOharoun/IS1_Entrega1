package org.ulpgc.is1.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private final List<Order> order;
    private Address address;

    public Customer(String name, String surname, String street, int number, int postalCode, String city) {
        this.name = name;
        this.surname = surname;
        this.address = new Address(street, number, postalCode, city);
        this.order = new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Order getOrder(int index) {
        return order.get(index);
    }

    public void addOrder(Order order) {
        this.order.add(order);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String surname, String street, int number, int postalCode, String city) {
        this.address = new Address(street, number, postalCode, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return String.format("%s %s, Dirección: %s", name, surname, address);
    }
}
