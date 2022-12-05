package ru.mirea.lab6_11;

public class Kelvin implements Convertable{
    private double cem;

    public double getCem() {
        return cem;
    }

    public void setCem(double cem) {
        this.cem = cem;
    }

    public Kelvin(double cem) {
        this.cem = cem;
    }


    @Override
    public double convert() {
        return cem+273.15 ;
    }
}
