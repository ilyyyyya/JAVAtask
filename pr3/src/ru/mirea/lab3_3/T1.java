package ru.mirea.lab3_3;

public class T1 {


    public static void main(String args[]){
       Double double1 = Double.valueOf(5.4568765464);
       Double double2 = Double.valueOf("38");
       System.out.println("1 пунтк\n" + double2);

       String str = "50";
       double value = Double.parseDouble(str);
       System.out.println("\n2 пункт\n" + value);

       double a;
       a = double1;
       short s = (short) a;
       byte b = (byte) a;
       long l = (long) a;
       float f =(float) a;
       String st = "" + double1;
       System.out.println("\n3 и 4 пункт\n"+s+"\n"+b+"\n"+l+"\n"+f+"\n"+st+"\n");
       String d =Double.toString(double1);
       System.out.println("5 пункт\n" + d);










    }

}
