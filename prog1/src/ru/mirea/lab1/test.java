package ru.mirea.lab1;
import java.util.Scanner;
import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        int[] b = new int[]{4,6,7,5,7,3,1,8,9,1};
        int sum=0;
        for (int i=0;i<b.length;i++)
        {
            sum = sum + b[i];

        }
        double sred=0;
        if(b.length > 0)
        {
            double suma = 0;
            for(int i=0;i<b.length;i++)
            {
                suma += b[i];
            }
            sred = suma / b.length;

        }
        System.out.println("Сумма чисел");
        System.out.println(sum);
        System.out.println("Среднее арифметическая");
        System.out.println(sred);

    }
}
