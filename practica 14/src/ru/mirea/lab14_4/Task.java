package ru.mirea.lab14_4;

import java.util.regex.Pattern;

public class Task {
    public static boolean hasPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static void main(String[] args) {
        System.out.println(hasPlus("1 / 3 - 5"));
        System.out.println(hasPlus("1 + 3 - 5"));
    }
}
