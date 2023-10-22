package org.ulpgc.is1.control;
import org.ulpgc.is1.model.*;

public class Main {

    public static OrderManager init() {
        OrderManager orderManager = new OrderManager();
        orderManager.addCustomer("Ian", "Trujillo", "street",42, 34012,
                "Las Palmas");
        orderManager.addCustomer("Mohamed", "O. Haroun", "street2", 43,24012, "Las palmas");

        orderManager.addRestaurant("restaurant",new Phone("928737456"), new Menu("menu1", MenuType.Daily));
        orderManager.addRestaurant("restaurant2",new Phone("928737455"), new Menu("menu2", MenuType.Tasting));

        orderManager.addDish("dish1", "ingredient1,ingredient2", 10);
        orderManager.addDish("dish2", "ingredient2,ingredient3", 20);
        orderManager.addDish("dish3", "ingredient3,ingredient4", 30);

        return orderManager;
    }

    public static void main(String[] args) {
        OrderManager orderManager = init();
        System.out.println(orderManager.getRestaurant(0));
        System.out.println(orderManager.getCustomer(1));
        System.out.println(orderManager.getDish(2));
        orderManager.order(0,0,new int[]{orderManager.getNumberDishes()- 1, orderManager.getNumberDishes()- 2}, new int[]{2,2});

        orderManager.removeCustomer(1);
        System.out.println(orderManager.getNumberCustomer());

        System.out.println(orderManager.getCustomer(0).getOrder(0).price());
    }
}
