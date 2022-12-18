package ru.mirea.lab21_1;

public class Demo {
    public static void main(String[] args) {
        System.out.print("List Integer:\n");
        Integer[] array = {1,2,3,4,5,6,7};
        Convert<Integer> listInt = new Convert<>(array);
        listInt.showList();

        System.out.print("List String:\n");
        String[] mas = {"ffsf","ddjkfhsd","sdjfh"};
        Convert<String> listStr = new Convert<>(mas);
        listStr.showList();
    }
}
