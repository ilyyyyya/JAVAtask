package ru.mirea.lab19_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО1", 67, 12, 18));
        s.add(new Student("ФИО2", 57, 23, 18));
        s.add(new Student("ФИО3", 93, 42, 19));
        s.add(new Student("ФИО4", 24, 2, 18));
        s.add(new Student("ФИО5", 66, 16, 18));

        new LabClassUI(s);
    }
}
