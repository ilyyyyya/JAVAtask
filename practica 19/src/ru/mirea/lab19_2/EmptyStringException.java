package ru.mirea.lab19_2;

public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(){
        super("An empty string passed!");
    }

}
