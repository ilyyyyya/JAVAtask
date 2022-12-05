package ru.mirea.lab23_1;

public class ArrayQueue {
    private final int START_CAPACITY = 10;
    private Object array[];
    private int size;
    private int head;
    private int tail;

    public ArrayQueue() {
        array = new Object[START_CAPACITY];
        head = tail = size = 0;
    }

    //pre: capacity>0
    //post: если требуемая емкость массива больше текущей
    //post: capacity = capacity * 2
    //inv: if(capacity = capacity*2) head < tail
    private void ensureCapacity(int capacity)
    {
        if(capacity >= array.length){
            Object[] temp = new Object[array.length << 1];
            int count = tail < head ? array.length - head : size;
            System.arraycopy(array,head,temp,0,count);
            if(tail < head)
                System.arraycopy(array,0,temp,count,tail);
            array = temp;
            head = 0;
            tail = size;
        }
    }

    //pre: value != null
    //pre: значение не имзенное
    //post: queue[size-1] = element
    //post: size` = size+1
    public void enqueue(Object element)
    {
        assert element != null;
        ensureCapacity(size+1);
        array[tail] = element;
        tail = (tail+1) % array.length;
        size++;
    }

    //pre: size > 0
    //post: result = queue[0]
    public Object element()
    {
        assert size > 0;
        return array[head];
    }

    //pre: size > 0
    //post: result = queue[0]
    //post: size` = size-1
    public Object dequeue()
    {
        assert size > 0;
        Object result = element();
        array[head] = null;
        size--;
        head = (head+1)% array.length;
        return result;
    }

    //post: result = size
    public int size()
    {
        return size;
    }

    //post result = size > 0 ?
    public boolean isEmpty()
    {
        return size == 0;
    }
    //inv: size` = 0
    //post: очистка очереди
    public void clear()
    {
        size = head = tail = 0;
        array = new Object[START_CAPACITY];
    }

    public Object[] toArray()
    {
        Object[] temp = new Object[size];
        int count = tail < head ? array.length - head : size;
        System.arraycopy(array,head,temp,0,count);
        if(tail < head)
            System.arraycopy(array,0,temp,count,tail);
        return temp;
    }
}
