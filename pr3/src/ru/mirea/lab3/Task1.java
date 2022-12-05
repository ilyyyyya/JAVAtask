package ru.mirea.lab3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Task1 {
    public static void main(String[] args) {
        int n,arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        arr = new int [n];
        for (int i=0;i<arr.length;i++)
            arr[i] = (int) ( Math.random() * n);
        for (int i: arr)
            System.out.print( i + " " );
        Arrays.sort(arr);
        System.out.println("\nОтсортированны массив:");
        for (int i: arr)
            System.out.print( i + " " );
        int c;
        Scanner input = new Scanner(System.in);
        //System.out.print("\nВведите размер массива: ");
        //c = in.nextInt();
        Random rand = new Random();
        int mas[] = new int [10];
        for (int i=0;i<10;i++){
            mas[i]=rand.nextInt(20);
        }
        System.out.println("\nМассив с помошью класса Random");
        for (int i: mas)
            System.out.print( i + " " );

        Arrays.sort(mas);
        System.out.println("\nОтсортированны массив:");
        for (int i: mas)
            System.out.print( i + " " );



    }

}


