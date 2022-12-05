package ru.mirea.lab13_1;

import java.util.Locale;

public class StringMain {
    public static void main(String[] args) {
        compareString("I like Java!!!");
    }


    private static void compareString(String str){
        System.out.println("last symbol of string:  "+str.charAt(13));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        

        System.out.println(str.replace("a","o"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(7,11));

    }
}
