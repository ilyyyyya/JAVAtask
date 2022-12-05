package ru.mirea.lab2_3;

public class main {
    public static void main(String[] args){
       Point center = new Point(3,3);
       Circle c = new Circle(6,center);
       System.out.println(c);
       center.move(4,6);
       c.moveCircle(4,center);
       System.out.println(c);
       Tester tester  = new Tester();
       tester.add(c);
       tester.countArr(c);
       Point cen = new Point(8,8);
       Circle l = new Circle(7,cen);
       tester.add(l);
       tester.countArr(l);
       Point k = new Point(8,8);
       Circle p = new Circle(7,k);
       tester.add(p);
       tester.countArr(p );








    }
}
