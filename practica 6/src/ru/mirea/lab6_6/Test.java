package ru.mirea.lab6_6;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("name1");
        Book b2 = new Book("name2");
        Shop sh1 = new Shop("shop1");
        Shop sh2 = new Shop("shop2");

        Printable[] printables ={b1,b2,sh1,sh2};

        for(Printable printable:printables){
            printable.print();
        }



    }
}
