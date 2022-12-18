package ru.mirea.lab29;

import java.util.ArrayList;
import java.util.List;

public class RestaurantOrder implements Order{



    List<Item> dishList = new ArrayList<>();


    @Override
    public boolean addPosition(Item item) {
        return dishList.add(item);
    }

    @Override
    public int count() {
        return dishList.size();
    }

    @Override
    public boolean remove(String dishName) {
        return dishList.remove(dishName);
    }

    @Override
    public void deleteAll(String name) {
        dishList.clear();
    }

    @Override
    public int costAll() {
        int sum = 0;
        for(int i = 0;i<dishList.size();i++)
            sum += dishList.get(i).getCost();
        return sum;
    }

    @Override
    public int orderName(String p) {
        int k = 0;
        while(dishList.contains(p))
            k++;
        return  k;
    }

    @Override
    public String[] getDishes() {
        String[] str = new String[dishList.size()];
        for(int i = 0; i<dishList.size();i++)
            str[i] = "| Name: " + dishList.get(i).getName()+ " "+ " Description: " + dishList.get(i).getDescription() + " " + "Cost: " +  dishList.get(i).getCost()+" |";
        return str;
    }
}
