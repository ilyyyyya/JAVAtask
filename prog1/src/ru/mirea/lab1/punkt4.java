package ru.mirea.lab1;

import java.util.Scanner;

public class punkt4 {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);//объявляем scanner

    //System.out.println("Введите длину массива: ");
    //int size = input.nextInt();//
    int arr[] = new int[10];
    int i = 0;
    int Sum=0;
        System.out.println("Введите элементы массива: ");
        while(i<10)
    {
        arr[i] = input.nextInt();
        Sum = Sum+arr[i];
        i++;
    }
        System.out.println("Сумма =" + Sum);
        int suma = 0;
        int b = 0;
    do {
        arr[b] = input.nextInt();
        suma = suma+arr[b];
        b++;
        }while(b<10);
        System.out.println("Сумма =" + suma);
    }

}

