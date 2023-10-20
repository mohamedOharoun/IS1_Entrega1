package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Restaurant {
    private String name;

    private Phone phone;

    private final List<Menu> menus;

    private List<Order> orders;

    public Restaurant(String name, Phone phone, Menu menu) {
        this.name = name;
        this.phone = phone;
        this.menus = new ArrayList<>();
        this.menus.add(menu);
        this.orders = new ArrayList<>();
    }

    public Restaurant(String name, Phone phone, List<Menu> menus) {
        this.name = name;
        this.phone = phone;
        this.menus = new ArrayList<>(menus);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Menu getMenu(int  index) {
        return menus.get(index);
    }

    public void addMenu(Menu menu) {
        this.menus.add(menu);
    }

    public Order getOrder(int index) {
        return orders.get(index);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
