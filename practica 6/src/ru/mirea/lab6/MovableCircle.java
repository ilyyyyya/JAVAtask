package ru.mirea.lab6;

public class MovableCircle implements Movable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        this.radius=radius;
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        center.y-=center.ySpeed;

    }

    @Override
    public void moveDown() {
        center.y+=center.ySpeed;

    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;

    }

    @Override
    public void moveRight() {
        center.x+=center.xSpeed;

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
