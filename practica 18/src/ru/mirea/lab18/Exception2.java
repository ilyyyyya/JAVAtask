package ru.mirea.lab18;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer ");
        String intString = scan.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
       }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException occurred");
       }
        catch(Exception e){
            System.out.println("Exception occurred");
        } finally{
            System.out.println("finally block worked!!!!");

        }







    }
}
