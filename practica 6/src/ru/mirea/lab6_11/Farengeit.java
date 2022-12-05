package ru.mirea.lab6_11;

public class Farengeit implements Convertable{

    private double cem;

    public Farengeit( double cem) {

        this.cem = cem;
    }


    public double getCem() {
        return cem;
    }

    public void setCem(double cem) {
        this.cem = cem;
    }

    @Override
    public double convert() {
        return (1.8*cem)+32;

    }
}
