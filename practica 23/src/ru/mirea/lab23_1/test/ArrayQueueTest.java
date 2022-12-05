package ru.mirea.lab23_1.test;

import ru.mirea.lab23_1.ArrayQueue;

public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        fill(queue);
        dump(queue);
        fill(queue);
        clear(queue);
        fill(queue);
        getArray(queue);
    }

    public static void fill(ArrayQueue queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    public static void dump(ArrayQueue queue) {
        while (!queue.isEmpty()) {
            System.out.println("size: "+queue.size() + " | first elem: " + queue.element() + " | delete and return first elem: " + queue.dequeue());
        }
    }

    public static void getArray(ArrayQueue queue) {
        Object[] arr = queue.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void clear(ArrayQueue queue) {
        queue.clear();
        System.out.println("Queue is empty? " + queue.isEmpty());
    }

}
