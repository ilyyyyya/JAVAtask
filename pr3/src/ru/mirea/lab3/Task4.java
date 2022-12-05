package ru.mirea.lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n;
        System.out.println("Введите число больше 5");
        Scanner input = new Scanner(System.in);
        //n = input.nextInt();
        if (input.hasNextInt()) {
            do{
                n = input.nextInt ();
                if (n <= 3)
                {System.out.println("Повтори");}
            }
            while (n <= 3);


            int[] mas1 = new int[n];
            for (int i = 0; i < n; i++) {
                mas1[i] = (int) (Math.random() * n);
                System.out.print(mas1[i] + " ");
            }


            System.out.println("\n");

            for (int j = 0; j < n; j++) {
                if (mas1[j] % 2 < 1) {
                    System.out.print(mas1[j] + " ");
                }
            }
        }
    }

}
