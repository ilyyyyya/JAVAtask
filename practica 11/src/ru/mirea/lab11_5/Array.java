package ru.mirea.lab11_5;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
    ArrayList<Integer> arrayList = new ArrayList<>();

    void insert(long n){
        for(int i=0;i<=n;i++){
            arrayList.add((int)(Math.random()*50));
        }
//        System.out.println(arrayList.toString());
    }

    void delete(){
        arrayList.clear();
//        System.out.println(arrayList.toString());
    }

    void search(int elem){
        int index = Collections.binarySearch(arrayList, elem);
//        System.out.println(index);

    }

}
