package ru.mirea.lab9_1;

public class Student {

    public int idNumber[];

    public Student(){
        idNumber = new int[6];

        idNumber[0] = 20;
        idNumber[1] = 12;
        idNumber[2] = 15;
        idNumber[3] = 18;
        idNumber[4] = 30;
        idNumber[5] = 100;

    }

    public void selectionSort(){
        for(int i = 0; i<idNumber.length;i++){
            int min = idNumber[i];
            int min_i = i;
            for(int j = i+1;j< idNumber.length-1;j++)
                if(idNumber[j] < min){
                    min = idNumber[j];
                    min_i = j;
                }
            if(i != min_i){
                int temp = idNumber[i];
                idNumber[i] = idNumber[min_i];
                idNumber[min_i] = temp;
            }
        }
    }

    public void print(){
        for(int a : idNumber){
            System.out.println(a);
        }
    }
}
