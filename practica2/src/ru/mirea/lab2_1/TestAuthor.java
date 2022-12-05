package ru.mirea.lab2_1;

public class TestAuthor {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in, "ibm866");
        Author a = new Author("илья", "ilya@yandex.ru",'m');
        System.out.println(a);
    }
}
