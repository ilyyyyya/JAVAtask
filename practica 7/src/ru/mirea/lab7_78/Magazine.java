package ru.mirea.lab7_78;

public class Magazine implements Printable{

    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public static void printMagazines(Printable[] printables){
        for(Printable p : printables){
            if(p instanceof Magazine)
                p.print();
        }
    }

    @Override
    public Printable print() {
        System.out.println(name);
        return null;

    }
}
