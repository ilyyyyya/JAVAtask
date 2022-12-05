package ru.mirea.lab8_14;

public class Task15 {

    public static String recursion(int n){
        return (n/10>0) ? n%10 + "  " + recursion(n/10) : n + "";
    }
    public static void main(String[] args) {
        int n = 1039876897;
        System.out.println(recursion(n));
    }
}
