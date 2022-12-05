package ru.mirea.lab11_2_4;

import java.util.Calendar;

public class Date {
    int year,month,day,hour,minute,second;

    Calendar calUser = Calendar.getInstance();
    Calendar cal = Calendar.getInstance();



    public Date(int yearUser,int monthUser, int dayUser, int hourUser,int minuteUser){
        calUser.set(Calendar.YEAR, yearUser);
        calUser.set(Calendar.MONTH, monthUser);
        calUser.set(Calendar.DAY_OF_MONTH, dayUser);
        calUser.set(Calendar.HOUR_OF_DAY, hourUser);
        calUser.set(Calendar.MINUTE, minuteUser);
        calUser.get(Calendar.SECOND);
    }

    public Date(){
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);
        cal.get(Calendar.DAY_OF_MONTH);
        cal.get(Calendar.HOUR_OF_DAY);
        cal.get(Calendar.MINUTE);
        cal.get(Calendar.SECOND);
    }
    public void printUser(){
        System.out.println("Now is: " + calUser.getTime());
    }

    public void print(){
        java.util.Date time = cal.getTime();
        System.out.println("Now is: " + time);
    }

    public void compareCal(){
        System.out.println("Compare: ");
        System.out.println(cal.getTime().equals(calUser.getTime()));
    }
}
