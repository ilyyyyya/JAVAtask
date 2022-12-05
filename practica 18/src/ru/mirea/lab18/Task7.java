package ru.mirea.lab18;

import java.util.Scanner;

import static java.lang.System.exit;

public class Task7 {
    public static void main(String[] args) throws Exception {
        getKey();
    }

    public static void getKey() throws Exception {
        //Scanner myScanner = new Scanner( System.in);
        String key = "";
        printDetails(key);
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
        //try{
            if(key == "") {
                throw new Exception( "Key set to empty string" );
            }
       /* }catch (Exception e){
            System.out.println("1 sposob");
            exit(0);
        }*/
        return "data for " + key; }
}


