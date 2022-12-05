package ru.mirea.lab10;

import java.util.Comparator;

public class StudentComporator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o2).getMark()-((Student)o1).getMark();
    }
}
