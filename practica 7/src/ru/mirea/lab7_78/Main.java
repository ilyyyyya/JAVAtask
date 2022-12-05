package ru.mirea.lab7_78;

public class Main {
    public static void main(String[] args) {



        Printable[] printables = new Printable[3];
        printables[0] = new Magazine("magazine1");
        printables[1] = new Book("book1");
        printables[2] = new Magazine("magazine2");

        int k=0;
        for(Printable printable : printables){

            if (printables[k] instanceof Magazine){
                System.out.println("[+] method is used printMagazines:");
                Magazine.printMagazines(printables);
                k++;
            }
        }
        for(Printable printable : printables){
            if (printables[k] instanceof Book)
            {
                System.out.println("[+] method is used printBooks:");
                Book.printBooks(printables);
                k++;
            }
        }
    }
}
