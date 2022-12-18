package ru.mirea.lab21_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert<E> {
    private List<E> lst = new ArrayList<>();

    public Convert(E[] array){
        lst.addAll(Arrays.asList(array));
    }

    public void showList(){
        for(Object ls : lst){
            System.out.println(ls);
        }
    }
}
