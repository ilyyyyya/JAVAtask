package ru.mirea.lab2_3;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    private List<Circle> Array = new ArrayList<Circle>();{

        System.out.println("Массив создан");
    }

    public void add(Circle circle){
        this.Array.add(circle);
        System.out.println("Объект добавлен в массив");
    }
    public void countArr(Circle circle) {
        int count = Array.toArray().length;
        System.out.println("количесвто элементов в массиве " + count);

    }


}
