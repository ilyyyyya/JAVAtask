package ru.mirea.lab6;

public class MovableRectangle implements Movable {
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void moveUp() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= topLeft.ySpeed;

    }

    @Override
    public void moveDown() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.x += topLeft.xSpeed;

    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= topLeft.xSpeed;

    }

    @Override
    public void moveRight() {

        topLeft.x += topLeft.xSpeed;
        bottomRight.x += topLeft.xSpeed;

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
