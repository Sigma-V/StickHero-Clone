package org.example;

public class Platform extends GameObject{

    private int width;

    public Platform(int id, int xCoordinate, int yCoordinate, int width) {
        super(id, xCoordinate, yCoordinate);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void spawn(){

    }
}
