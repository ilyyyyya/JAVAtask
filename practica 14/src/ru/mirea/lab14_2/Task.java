package ru.mirea.lab14_2;

public class Task {

    public static boolean isThatStr(String s) {
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatStr("kjfhkjlfkjlhklfhjs234234"));
    }
}
