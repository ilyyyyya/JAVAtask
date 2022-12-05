package ru.mirea.lab3_4;

import java.text.NumberFormat;
import java.util.Scanner;

import java.util.Scanner;
import java.util.*;

class InternetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[] {100, 200, 300};
        String[] products = new String[]{"№1(Хлеб)", "№2(Яблоки)", "№3(Молоко)"};
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));
        int currentPrice = 0;
        int[] basket = new int[3];
        while(true) {

            System.out.print("Введите номер продукта который хотите купить.\n(Если вы все выбрали то напишите end, тогда вы перейдете к оплате): ");
            String userProduct = scanner.nextLine();
            if("end".equals(userProduct)){
                break;
            }
            System.out.print("Введите количество: ");
            int amount = scanner.nextInt();
            int userNumberProduct = Integer.parseInt(userProduct);
            currentPrice = currentPrice + (prices[userNumberProduct - 1] * amount);
            scanner.nextLine();
            basket[userNumberProduct - 1] = basket[userNumberProduct - 1] + amount;
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Продукт " + products[i]);
            System.out.println("Количество " + basket[i]);
            int priceOfproduct = basket[i] * prices[i];
            System.out.println("Стоимость " + priceOfproduct);
        }
        Locale locRUS = new Locale("rus");
        NumberFormat numFormat1 = NumberFormat.getCurrencyInstance();
        System.out.println("Oбщая цена " + numFormat1.format(currentPrice));
        System.out.println("Какой валютой вы бы хотел оплатить?:");
        System.out.println("1)RUB");
        System.out.println("2)USD");
        System.out.println("3)EUR");
        int choise = scanner.nextInt();
        switch(choise)
        {
            case 1:{
                double currnetPrice;

                System.out.println("Общая стоимость вашей покупки составляет " + numFormat1.format(currentPrice));

            }
            break;
            case 2:{
                double currnetPrice;
                Locale locUSA = new Locale("usa");
                NumberFormat numFormat2 = NumberFormat.getCurrencyInstance();


                System.out.println("Общая стоимость вашей покупки составляет " + numFormat2.format(currentPrice*0.016429));

            }
            break;
            case 3: {
                double currnetPrice;
                Locale locFR = new Locale("fr");
                NumberFormat numFormat3 = NumberFormat.getCurrencyInstance();

                System.out.println("Общая стоимость вашей покупки составляет " + numFormat3.format(currentPrice * 0.016608));

            }
            break;
        }


        scanner.close();
    }
}
