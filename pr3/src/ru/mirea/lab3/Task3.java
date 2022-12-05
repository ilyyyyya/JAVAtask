package ru.mirea.lab3;


import java.util.Random;

public class Task3 {

    public static int rand(int min,int max){
        Random rand = new Random();
        int randNum = rand.nextInt((max-min)+1)+min;
        return randNum;
    }

    public static void main(String[] args){
        int mas[]=new int[4];
        for(int i=0;i<mas.length;i++){
            mas[i]=rand(10,99);
            System.out.print(mas[i]+ " ");
        }
        String result = "Прогрессия возрастающая";
        for(int i=0;i<mas.length;i++){
            if(i>0 && mas[i-1] >= mas[i]){
                result = "Прогрессия не возрастающая";
            }
        }
        System.out.println(result);
    }

}
