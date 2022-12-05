package ru.mirea.lab3_4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Convert {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбирите одну из операций");
        System.out.println("1) USD to RUB");
        System.out.println("2) RUB to USD");
        System.out.println("3) RUB to EUR");
        int choise = sc.nextInt();
        switch(choise){
            case 1: {
                System.out.println("Введите число USD");

                double usd = sc.nextDouble();
                Locale locRUS = new Locale("rus");
                NumberFormat numFormat3 = NumberFormat.getCurrencyInstance();

                if (usd >= 0) {
                    System.out.println(usd + " USD это " + numFormat3.format(usd *60.8));

                }
                else{
                    System.out.println("Пожалуйста введите нормальное число USD");
                }


            }
            //break;
            case 2:{
                System.out.println("Введите число RUB");

                double rub = sc.nextDouble();
                Locale locUSA = new Locale("usa");
                NumberFormat numFormat1 = NumberFormat.getCurrencyInstance();

                if(rub>=0){
                    System.out.println(rub + " RUB это " +  numFormat1.format(rub*0.016429));
                }
                else{
                    System.out.println("Пожалуйста введите нормальное число RUB");
                }
            }
            //break;
            case 3:{
                System.out.println("Введите число RUB");

                double rub = sc.nextDouble();
                Locale locFR = new Locale("fr");
                NumberFormat numFormat2 = NumberFormat.getCurrencyInstance();

                if(rub>=0){
                    System.out.println(rub + " RUB это " +  numFormat2.format(rub*0.016608));
                }
                else{
                    System.out.println("Пожалуйста введите нормальное число RUB");
                }

            }
            //break;

        }
        sc.close();


    }
}
