package ru.mirea.lab6_4;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Ball b1 =new Ball(56.78,"football");
        Ball b2 = new Ball(99.11,"basketball");
        Ball b3 = new Ball(110,"volleyball");
        Fruit f1 = new Fruit("apple",56.12);
        Fruit f2 = new Fruit("orange",35);

        Priceable[] prices = {b1,b2,b3,f1,f2};
        for(Priceable price:prices){
            System.out.println(price);
        }
    }
}
