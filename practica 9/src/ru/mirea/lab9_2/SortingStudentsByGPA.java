package ru.mirea.lab9_2;

import java.util.Comparator;

public class SortingStudentsByGPA {

    private String name;
    private int finalScore;

    public SortingStudentsByGPA(String name, int finalScore) {
        this.name = name;
        this.finalScore = finalScore;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", finalScore=" + finalScore +
                '}';
    }

    public String getName() {
        return name;
    }


    public int getFinalScore() {
        return finalScore;
    }

}
