package ru.mirea.lab6_4;

public class Ball implements Priceable{

    private double price;
    private String type;

    public Ball(double price, String type) {
        this.price = price;
        this.type = type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "price=" + getPrice() +
                "$, type='" + type  +
                '}';
    }
}
