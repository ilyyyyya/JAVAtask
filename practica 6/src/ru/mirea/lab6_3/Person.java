package ru.mirea.lab6_3;

public class Person implements Nameable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
