package ru.mirea.lab21_2;

public class UniversArray<E> {

    private E[] arr;

    public E getArrindex(int i ){
        return  arr[i];
    }

    public void setArr(E[] arr){
        this.arr= arr;

    }

    public int getLength(){
        return arr.length;
    }


}
