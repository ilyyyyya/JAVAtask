package ru.mirea.lab6_11;

public class Test {
    public static void main(String[] args) {
        Farengeit f1 = new Farengeit(41);
        Kelvin k1 = new Kelvin(45);

        System.out.println("41 TC -> " + f1.convert()+ " TF");
        System.out.println("45 TC -> " + k1.convert() + " TK");
    }
}
