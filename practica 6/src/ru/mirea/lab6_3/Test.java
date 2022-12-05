package ru.mirea.lab6_3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        Person p1 =new Person("Ivan");
        Person p2 =new Person("Ilya");
        Pet pet1 = new Pet("Sharik");
        Pet pet2 = new Pet("Shuchka");

        Nameable[] names = {p1,p2,pet1,pet2};
        for(Nameable name: names)
        {
            System.out.println(name);
        }



    }
}
