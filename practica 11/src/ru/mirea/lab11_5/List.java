package ru.mirea.lab11_5;

import java.util.Collections;
import java.util.LinkedList;

public class List {

    LinkedList<Integer> list = new LinkedList<>();

    void add(long n) {
        for (int i = 0; i <= n; i++) {
            list.add((int) (Math.random() * 50));
        }
//        System.out.println(list.toString());
    }

    void delete() {
      list.clear();

    }

    void searchList(int elem) {
        int index = Collections.binarySearch(list, elem);
//        System.out.println(index);
    }
}


