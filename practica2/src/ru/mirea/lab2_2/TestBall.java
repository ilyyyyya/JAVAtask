package ru.mirea.lab2_2;

public class TestBall {
    public static void main(String[] args){
        Ball b = new Ball();
        System.out.println(b);
        b.setXY(2.7,7.8);
        System.out.println(b);
        b.move(13,-6);
        System.out.println(b);
    }
}
