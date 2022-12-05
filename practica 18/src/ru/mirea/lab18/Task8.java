package ru.mirea.lab18;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) throws Exception {
        getKey();
    }

    public static void getKey()  {
        int chance = 0;
        while(chance >= 0 && chance < 2)
        {
            try {
                Scanner myScanner = new Scanner( System.in);
                String key = myScanner.nextLine();
                if(key.isEmpty()) {
                    chance++;
                    if(chance ==1){
                        System.out.println("1 chance!!!");
                    }
                    else {
                        System.out.println("Are you stupid?");
                    }

                }
                printDetails(key);
            } catch (Exception e) {
                if(chance == 2){
                    System.out.println("Error!!");
                }
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }

        return "data for " + key; }
}
