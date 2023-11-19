package org.example;

public class Background extends GameObject implements Moving{


    private float speed;

    private int imageId;
    public Background(int id, int xCoordinate, int yCoordinate, int imageId, float speed) {
        super(id, xCoordinate, yCoordinate);
    }

    public float getSpeed() {
        return speed;
    }

    public int getImageId() {
        return imageId;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }



    @Override
    public void spawn(){

    }
    @Override
    public void move() {

    }
}
