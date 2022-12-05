package ru.mirea.lab8_14;

public class Task14 {



    public static void main(String[] args) {
        int n = 10202131;
        System.out.println(recursion(n));
    }
    private static String recursion(int n){
        return (n/10 > 0) ? recursion(n/10)+ "  " + n%10 : n + "";
    }
}
