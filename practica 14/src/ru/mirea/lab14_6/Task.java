package ru.mirea.lab14_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(checkEmail("sagrachov@gmail.com"));
        System.out.println(checkEmail(".sag rachov@gmail.com"));
        System.out.println(checkEmail("sagrachov.@.gmail.com"));
    }
}
