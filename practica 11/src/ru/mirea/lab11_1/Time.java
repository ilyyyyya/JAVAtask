package ru.mirea.lab11_1;

import java.util.Calendar;
import java.util.Date;

public class Time {
    public static void display(int year,int month, int day, int hour , int minute, int second){
        Person developer = new Person("Ivan","Ivanov");


            Calendar Cal = Calendar.getInstance();
            Cal.set(Calendar.YEAR, year);
            Cal.set(Calendar.MONTH, month);
            Cal.set(Calendar.DAY_OF_MONTH, day);
            Cal.set(Calendar.HOUR_OF_DAY, hour);
            Cal.set(Calendar.MINUTE, minute);
            Cal.set(Calendar.SECOND, second);

            System.out.println("Developer: "+
                    "\nName: " + developer.getName() + "\nSurname: "+developer.getSurname());
            Date startDate = Cal.getTime();
            System.out.println("\nDate and time the task was received\n" + startDate);

            Date currTime = new Date();


            System.out.println("\nDate and time of assignment\n" + currTime);




    }
}
