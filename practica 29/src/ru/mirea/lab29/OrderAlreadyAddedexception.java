package ru.mirea.lab29;

public class OrderAlreadyAddedexception extends Exception{
    public OrderAlreadyAddedexception(int ex){
        super("Order is already adde at " + ex + "table");
    }
}
