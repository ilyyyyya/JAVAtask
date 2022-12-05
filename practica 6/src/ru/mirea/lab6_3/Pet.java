package ru.mirea.lab6_3;

public class Pet implements Nameable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
