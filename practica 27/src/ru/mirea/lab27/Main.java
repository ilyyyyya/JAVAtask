package ru.mirea.lab27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> object = new HashSet<>();

        object.add("I");
        object.add("love");
        object.add("java");

        Set<Integer> obj = new HashSet<>();

        obj.add(1);
        obj.add(6);
        obj.add(4);
        obj.add(34);

        System.out.println("HashSet: " + object);

        System.out.println("HashSet: " + obj);

        Set<String> hashSettoTree = new TreeSet<>();
        hashSettoTree.addAll(object);

        Set<Integer> TreeSet = new TreeSet<>();
        TreeSet.addAll(obj);


        System.out.println("TreeSet: " + hashSettoTree);
        System.out.println("TreeSet: " + TreeSet);
    }
}
