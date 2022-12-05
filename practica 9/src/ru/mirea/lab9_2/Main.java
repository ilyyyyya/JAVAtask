package ru.mirea.lab9_2;

import ru.mirea.lab9_1.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<SortingStudentsByGPA> students = new ArrayList<>
                (Arrays.asList(new SortingStudentsByGPA("John",123),
                new SortingStudentsByGPA("John",123),
                new SortingStudentsByGPA("Tom",154),
                new SortingStudentsByGPA("Leo",87),
                new SortingStudentsByGPA("Nick",34)
        ));

        Collections.sort(students, new Comparator<SortingStudentsByGPA>() {
            @Override
            public int compare(SortingStudentsByGPA o1, SortingStudentsByGPA o2) {
                return o2.getFinalScore() - o1.getFinalScore();
            }
        });

        System.out.println(students);

    }
}
