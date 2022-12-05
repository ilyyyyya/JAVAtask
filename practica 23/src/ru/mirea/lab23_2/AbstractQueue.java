package ru.mirea.lab23_2;

public abstract class AbstractQueue implements  Queue{

    protected int size = 0;

    protected abstract void enqueueRealisation(Object element);

    protected abstract Object elementRealisation();

    protected abstract void dequeueRealisation();


    @Override
    public void enqueue(Object element) {
        assert element != null;
        enqueueRealisation(element);
        size++;
    }

    @Override
    public Object element() {
        assert size > 0;
        return elementRealisation();
    }

    @Override
    public Object dequeue() {
        assert size > 0;
        Object result = elementRealisation();
        dequeueRealisation();
        --size;
        return result;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {

        while(!isEmpty())
        {
            dequeue();
        }
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for(int i = 0; i < size; i++){
            newArray[i] = dequeue();
            enqueue(newArray[i]);
        }
        return newArray;
    }
}
