package ru.mirea.lab4_2;

public abstract class Clothes {
    private SizeClose size;
    private String color;
    private double prise;

    public Clothes(SizeClose size,String color,double prise){
        this.size=size;
        this.color=color;
        this.prise=prise;
    }
    public SizeClose getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public double getPrise(){
        return prise;
    }
    public String toString(){
        return "Одежда(" + "размер= "+ size+"цена= "+ prise+"цвет= " +color;
    }
}

