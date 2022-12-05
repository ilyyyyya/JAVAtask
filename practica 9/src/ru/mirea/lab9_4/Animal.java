package ru.mirea.lab9_4;

import java.util.Comparator;

public class Animal implements Comparable<Animal> {
    public String name;
    public int yearDiscovery;
    public int population;

    public Animal(String name, int yearDiscovery, int population) {
        this.name = name;
        this.yearDiscovery = yearDiscovery;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", yearDiscovery=" + yearDiscovery +
                ", population='" + population + '\'' +
                '}';
    }


    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.yearDiscovery,o.yearDiscovery);
    }
}
