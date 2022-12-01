package ru.mirea.lab19_1;

import java.math.BigInteger;
import java.util.Scanner;

public class INNChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter number INN: ");
            try{
                BigInteger inn = new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            } catch (INNNotValidException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("INN is valid!!!!");
    }

    public static boolean checkInn(BigInteger inn) throws INNNotValidException{
        int i = 0;
        BigInteger INN = new BigInteger(inn.toByteArray());
        while(!INN.equals(new BigInteger("0"))){
            i++;
            INN = new BigInteger(INN.divide(new BigInteger("10")).toByteArray());
        }

        if(i != 10 && i !=12) throw new INNNotValidException(inn);
        return true;


    }
}
