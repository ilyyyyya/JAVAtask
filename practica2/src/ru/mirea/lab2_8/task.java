package ru.mirea.lab2_8;
import java.util.*;


public class task {
    public static void main(String[] args){


        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");
        Collections.reverse(Arrays.asList(colors));
        System.out.println(Arrays.asList(colors));


    }
}
