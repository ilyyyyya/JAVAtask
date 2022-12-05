package ru.mirea.lab23_1.test;

import ru.mirea.lab23_1.ArrayQueueModule;

public class ArrayQueueModuleTest {

    public static void main(String[] args) {
        fill();
        dump();
        fill();
        clear();
        fill();
        getArray();
    }

    public static void fill() {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
    }

    public static void getArray() {
        Object[] arr = ArrayQueueModule.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void dump() {
        while (!(ArrayQueueModule.isEmpty())) {
            System.out.println(ArrayQueueModule.size() + " " + ArrayQueueModule.element() + " " + ArrayQueueModule.dequeue());
        }
    }

    public static void clear() {
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());
    }
}

