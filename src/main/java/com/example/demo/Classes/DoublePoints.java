package org.example;

public class DoublePoints extends GameObject implements Powerups{

    private int duration;
    private int spawnRate;

    public DoublePoints(int id, int xCoordinate, int yCoordinate,int duration, int spawnRate) {
        super(id, xCoordinate, yCoordinate);
    }

    public int getDuration() {
        return duration;
    }

    public int getSpawnRate() {
        return spawnRate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setSpawnRate(int spawnRate) {
        this.spawnRate = spawnRate;
    }

    @Override
    public void spawn(){

    }

    @Override
    public void effects() {

    }
}
