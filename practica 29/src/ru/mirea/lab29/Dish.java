package ru.mirea.lab29;

public class Dish implements Item{

    private final int cost;
    private final String name, description;

    public Dish( String name, String description,int cost) throws IllegalArgumentException {
        if (cost == 0 || name == "" || description == "")
            throw new IllegalArgumentException();
        else{
            this.cost = cost;
            this.name = name;
            this.description = description;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
