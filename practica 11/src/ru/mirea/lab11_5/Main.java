package ru.mirea.lab11_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n =100000000;
        System.out.println("\nTime for ArrayList\n");
        Array arr = new Array();

        long startTime = System.currentTimeMillis();
        arr.insert(n);
        long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("ADD elements for "+estimatedTime+" ms");



        Scanner in = new Scanner(System.in);
        System.out.print("Which element do you want search:");
        int elem = in.nextInt();
        long startTime2 = System.currentTimeMillis();
        arr.search(elem);
        long estimatedTime2 = System.currentTimeMillis()-startTime2;
        System.out.println("SEARCH element for "+estimatedTime2+" ms");

        long startTime1 = System.currentTimeMillis();
        arr.delete();
        long estimatedTime1 = System.currentTimeMillis()-startTime1;
        System.out.println("DELETE elements for "+estimatedTime1+" ms");


        System.out.println("=========================");

        System.out.println("\nTime for LinkedList\n");
        List list = new List();
        long startTime10 = System.currentTimeMillis();
        list.add(n);
        long estimatedTime10 = System.currentTimeMillis()-startTime10;
        System.out.println("ADD elements for "+estimatedTime10+" ms");


        Scanner input1 = new Scanner(System.in);
        System.out.print("Which element do you want search: ");
        int elem1 = input1.nextInt();
        long startTime11 = System.currentTimeMillis();
        list.searchList(elem1);
        long estimatedTime11 = System.currentTimeMillis()-startTime11;
        System.out.println("Search element for "+estimatedTime11+" ms");

        long startTime12 = System.currentTimeMillis();
        list.delete();
        long estimatedTime12 = System.currentTimeMillis()-startTime12;
        System.out.println("DELETE element for "+estimatedTime12+" ms");




    }
}
