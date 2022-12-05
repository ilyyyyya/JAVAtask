package ru.mirea.lab11_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan","Ivanov");
        System.out.println(s1);
        Scanner scan = new Scanner(System.in);
        System.out.println("In what format do you want to enter the date");
        System.out.println("1) Saturday, September 25, 2010");
        System.out.println("2) Sat 2010.09.25 at 09:27:01 ");
        System.out.println("3) Sat 2010.09.25 at 09:27:01 PM SGT");
        int menu = scan.nextInt();
        switch (menu){
            case 1:
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Date:");
                int year = in.nextInt();
                int month = in.nextInt();
                int day = in.nextInt();
                studentDate d1 = new studentDate(year,month,day);
                System.out.println(d1.toString());
                break;
            }
            case 2:
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Date:");
                int year = in.nextInt();
                int month = in.nextInt();
                int day = in.nextInt();
                int hour = in.nextInt();
                int minute = in.nextInt();
                int seconds = in.nextInt();
                studentDate d2 = new studentDate(year,month,day,hour,minute,seconds);
                System.out.println(d2.toString1());
                break;
            }
            case 3:
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Date:");
                int year = in.nextInt();
                int month = in.nextInt();
                int day = in.nextInt();
                int hour = in.nextInt();
                int minute = in.nextInt();
                int seconds = in.nextInt();
                studentDate d2 = new studentDate(year,month,day,hour,minute,seconds);
                System.out.println(d2.toString2());
                break;
            }
        }







    }
}
