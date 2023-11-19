package org.example;

public class Hero extends GameObject implements Moving{

    private float speed;
    private String skin;


    public Hero(int id, int xCoordinate, int yCoordinate, float speed, String skin) {
        super(id, xCoordinate, yCoordinate);
    }

    public float getSpeed() {
        return speed;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void spawn(){

    }
    @Override
    public void move() {

    }
}
