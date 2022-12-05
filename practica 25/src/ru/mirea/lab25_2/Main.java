package ru.mirea.lab25_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static Scanner scanner;
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String def = "\u001B[0m";

    private static final String IPADRESS =
            "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$";



    public static void main(String[] args) throws FileNotFoundException {

        scanner = new Scanner(new File("C:/Users/Илья/IdeaProjects/practica 25/src/ru/mirea/lab25_2/test.txt"));
        System.out.println("TASK 2:\n");
        task2();
        System.out.println(def + "\nTASK 3:\n");
        task3();
        System.out.println(def + "\nTASK 4:\n");
        print();



    }



    private static void task2() {

        String string;
        Pattern pattern = Pattern.compile("((((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|(\\d?\\d))\\.){3}((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|(\\d?\\d))|(\\d{1,10}))|((((0x[\\dA-Fa-f]{2})\\.){3}(0x[\\dA-Fa-f]{2}))|(0x[\\dA-Fa-f]{8}))|((((0[0-7]{3})\\.){3}(0[0-7]{3}))|(0[0-7]{11}))");

        try {
            while (!(string = scanner.nextLine()).equals(">")) {
                System.out.println((string.matches(pattern.pattern()) ? GREEN + "+" : RED + "-") + "\t" + string);
            }
        } catch (NoSuchElementException ignored) {}
    }

    private static void task3(){
        String ip;
        Pattern pattern = Pattern.compile("^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$");
        try{
            while(!(ip = scanner.nextLine()).equals(">"))
            {
                System.out.println((ip.matches(pattern.pattern())? GREEN + "+" : RED + "-") + "\t" + ip);
            }
        }catch (NoSuchElementException ignored)
        {}
    }

    private static void print() {
        String check;
        try{
            while (!(check = scanner.nextLine()).equals(">")) {
                System.out.println(((task4(check)) ? GREEN + "+" : RED + "-" )+ "\t" + check);
            }
        }
        catch (NoSuchElementException ignored){}
    }
    private static boolean task4(String s){
        return 0 == s.chars()
                .mapToObj(Character::toString)
                .filter("()"::contains)
                .map("("::equals)
                .mapToInt(b -> b ? 1 : -1)
                .reduce(0,(x,y) -> ( x >= 0 && x+y >= 0) ? x+y : -1);

    }
}
