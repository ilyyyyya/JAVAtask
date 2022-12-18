package ru.mirea.lab1;
import java.util.Scanner;

public class punkt7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число факториала:");
        int N = in.nextInt();
        int fac = 1;
        for (int i = N; i > 0; i--) {
            fac *= i;
        }
        System.out.println(fac);
    }
}

