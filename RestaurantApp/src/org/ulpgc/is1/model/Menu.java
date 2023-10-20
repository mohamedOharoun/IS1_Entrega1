package org.ulpgc.is1.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private String name;
    private List<Dish> dishes;

    private MenuType menuType;

    public Menu(String name, MenuType menuType) {
        this.name = name;
        this.menuType = menuType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dish getDishes(int index) {
        return dishes.get(index);
    }

    public void addDish(Dish dishes) {
        this.dishes.add(dishes);
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }
}
