package ru.mirea.lab11_2_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.print();

        Scanner in = new Scanner(System.in);
        System.out.println("Entre Date:");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        int hour = in.nextInt();
        int minute = in.nextInt();

        Date d2 = new Date(year,month,day,hour,minute);
        d2.printUser();

        d2.compareCal();

    }
}
