package ru.mirea.lab23_2;

public interface Queue {
    void enqueue(Object element);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();

    Object[] toArray();
}
