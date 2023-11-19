package org.example;

public class Cherry extends GameObject{

    private String Colour;
    private int spawnRate;


    public Cherry(int id, int xCoordinate, int yCoordinate, String Colour, int spawnRate) {
        super(id, xCoordinate, yCoordinate);
    }

    public int getSpawnRate() {
        return spawnRate;
    }

    public String getColour() {
        return Colour;
    }

    public void setSpawnRate(int spawnRate) {
        this.spawnRate = spawnRate;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    @Override
    public void spawn(){

    }
}
