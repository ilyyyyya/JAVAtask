package ru.mirea.lab7_78;

public class Book implements Printable{

    String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Printable print() {
        System.out.println(name);
        return null;
    }

    public static void printBooks(Printable[] printables){
        for(Printable p : printables){
            if(p instanceof Book)
                p.print();
        }
    }
}
