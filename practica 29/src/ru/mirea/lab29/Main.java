package ru.mirea.lab29;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws OrderAlreadyAddedexception{
        ArrayList<String> dish = new ArrayList<>();
        dish.add("Pizza: Peperoni: 590");
        dish.add( "Pizza: 4 cheeses: 550");
        dish.add("Lasagna: Tasty Italian dish: 600");
        dish.add("Greek salad: Vegetables: 320");
        dish.add("Water: original: 160");
        dish.add("Beer: light, dark: 260");
        dish.add("Juice: Orange, Apple, Multi: 190");

        System.out.println("Menu -> ");
        for(String s : dish)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();

        restaurantOrder.addPosition(new Dish("Pizza","4 cheeses", 550 ));
        restaurantOrder.addPosition(new Drink("Beer","light",260));

        System.out.println("\nPositions in order №1: " + restaurantOrder.count());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));
        System.out.println("Amount payable: " + restaurantOrder.costAll());

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();

        restaurantOrder1.addPosition(new Dish("Lasagna","Tasty Italian dish",600));
        restaurantOrder1.addPosition(new Dish("Greek salad","Vegetables",320));
        restaurantOrder1.addPosition(new Drink("Juice","Orange",190));
        restaurantOrder1.addPosition(new Drink("Juice","Apple",190));
        restaurantOrder1.addPosition(new Drink("Juice","Multi",190));

        System.out.println("\nPositions in order №2: " + restaurantOrder1.count());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));
        System.out.println("Amount payable: " + restaurantOrder1.costAll());

        System.out.println("\nRestaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);
        orderManager.add(restaurantOrder1, 6);
        System.out.println(orderManager.orders());


        InternetOrder internetOrder = new InternetOrder();

        internetOrder.addPosition(new Dish("Pizza","Peperoni",590));
        internetOrder.addPosition(new Drink("Beer","dark",260));
        System.out.println("\nInternet orders: ");
        orderManager.add(internetOrder, "Arbat street");
        System.out.println(orderManager.getInternetOrder());
        
        System.out.println(orderManager.getOrder("Arbat street"));
    }
}
