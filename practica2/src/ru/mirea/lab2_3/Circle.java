package ru.mirea.lab2_3;

public class Circle {
    private int radius;
    private Point center;

    public Circle(){
        int radius = 1;
        Point center = new Point(0,0);
    }
    public Circle(int radius){
        this.radius=radius;
        this.center=new Point(0,0);
    }
    public Circle(Point center){
        this.radius = 1;
        this.center=center;
    }
    public Circle(int radius,Point center){
        this.radius=radius;
        this.center=center;
    }
    public void moveCircle (int r, Point b){
        this.radius = r;
        this.center = b;
    }



    public String toString(){
        return "радуис: "+radius + " центр: "+center;
    }




}
