package ru.mirea.lab20_4;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        if (array.length > 0) {
            T min = array[0];
            for (T t : array) {
                if (t.compareTo(min) < 0)
                    min = t;
            }
            return min;
        }
        return null;

    }
    public T getMax(){
        if(array.length > 0){
            T max = array[0];
            for(T t : array){
                if(t.compareTo(max) > 0){
                    max = t;
                }
            }
            return max;
        }
        return null;

    }

    @Override
    public String toString() {
        return "MinMax[" +
                 array.getClass().getSimpleName() +
                "]" + " { " + Arrays.toString(array) + '}';
    }
    public static void printMinMaxInfo(MinMax<?> arr) {
        System.out.println(arr);
        System.out.println("Min element - \'" + arr.getMin() + '\'');
        System.out.println("max element - \'" + arr.getMax() + '\'');
    }

    public static void main(String[] args) {
        MinMax<Character> aChar = new MinMax<>(new Character[]{'a', 'k', 'r', 'd'});
        printMinMaxInfo(aChar);

        MinMax<Double> aDouble = new MinMax<>(new Double[]{68.54, 71.75, 19.21, 7.88});
        printMinMaxInfo(aDouble);

    }
}
