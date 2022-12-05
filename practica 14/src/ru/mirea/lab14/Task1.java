package ru.mirea.lab14;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("enter pattern");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }
}
