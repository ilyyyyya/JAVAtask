package ru.mirea.lab2_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.print("сколько пк хотите ввести: ");
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {

            System.out.println("Введите название пк: ");
            String name = in.next();
            System.out.println("Введите артикуль пк: ");
            int article = in.nextInt();
            shop.addComp(new Comp(name,article));


        }
        in.close();
        System.out.println(shop);
        shop.deleteComp(1);
        System.out.println(shop);
        System.out.println("ПК под название lenovo в магазине под номером" + shop.findindex("lenovo"));



    }
}
