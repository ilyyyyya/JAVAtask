package ru.mirea.lab21_2;

public class MyClass {
        public static <E> void task3(String s, E[] arr){

            E[] a = arr;
            UniversArray<E> task3 = new UniversArray<>();
            task3.setArr(a);

            System.out.print(s + " ");

            for(int i =0; i < task3.getLength(); i++){
                System.out.print(task3.getArrindex(i)+" ");
            }

            System.out.println();

        }

        public static void main(String[] args) {
            String [] s = {"Hello", "World","!"};
            task3("String:" , s);

            Integer [] intr = { 1,2,3,4,5,6,7,8};
            task3("Integer:" , intr);

            Double [] ad = {1.2,1.5,6.7};
            task3("Double:" , ad);
        }
    }

