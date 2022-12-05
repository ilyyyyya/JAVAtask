package ru.mirea.lab11_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class studentDate {
    private int year, month,day,hour,minute,seconds;

    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy, MMMM ,d ");
    SimpleDateFormat sdf2  = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss");

    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a z");

    public studentDate(int year,int month, int day){
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.get(Calendar.MINUTE);
        cal.get(Calendar.SECOND);
    }



    public studentDate(int year,int month, int day,int hour,int minute, int seconds){
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, seconds);
    }

    @Override
    public String toString() {
        return "studentDate {" +
                sdf.format(cal.getTime()) + "}";
    }

    public String toString1(){
        return "studentDate {"+
                sdf2.format(cal.getTime())+ "}";

    }
    public String toString2(){
        return "studentDate {"+
                sdf3.format(cal.getTime())+ "}";

    }
}
