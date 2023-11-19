package org.example;

public class Stick extends GameObject implements Moving{

    private float speed;

    private float width;

    public Stick(int id, int xCoordinate, int yCoordinate,float speed, float width) {
        super(id, xCoordinate, yCoordinate);
    }

    public float getSpeed() {
        return speed;
    }

    public float getWidth() {
        return width;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public void spawn(){

    }

    @Override
    public void move() {

    }
}
