package org.ulpgc.is1.model;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private static int NEXT_ID = 0;
    private final int id;
    private final List<OrderItem> orderItems;

    private Customer customer;


    public Order(Restaurant restaurant, Customer customer) {
        this.restaurant = restaurant;
        this.id = NEXT_ID++;
        this.customer = customer;
        this.orderItems = new ArrayList<>();
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }



    public int getId() {
        return id;
    }

    public OrderItem getOrderitem(int index) {
        return orderItems.get(index);
    }

    public void addOrderItem(int quantity, Dish dish) {
        this.orderItems.add(new OrderItem(quantity, dish));
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int price() {
        int price = 0;
        for (OrderItem orderItem : this.orderItems) {
            price += orderItem.getQuantity() * orderItem.getDish().getPrice();
        }
        return price;
    }
}
