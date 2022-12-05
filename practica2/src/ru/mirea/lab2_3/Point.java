package ru.mirea.lab2_3;

public class Point {
    private int x;
    private int y;

    public Point(){
        x = y =0;
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void move (int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x: " +
                x + " y: "+
                y;
    }
}
