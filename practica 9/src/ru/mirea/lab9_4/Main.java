package ru.mirea.lab9_4;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Тигр",1758,6500));
        animals.add(new Animal("Волк",1659,1000000));
        animals.add(new Animal("Лошадь",1564,40000));

        Collections.sort(animals);
        for(Animal animal:animals){
            System.out.println(animal);
        }



    }
}
