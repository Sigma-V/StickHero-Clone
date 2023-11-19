package org.example;

public class Ice extends GameObject implements Powerups{

    private int duration;
    private int spawnRate;

    public Ice(int id, int xCoordinate, int yCoordinate,int duration, int spawnRate) {
        super(id, xCoordinate, yCoordinate);
    }

    public int getSpawnRate() {
        return spawnRate;
    }

    public int getDuration() {
        return duration;
    }

    public void setSpawnRate(int spawnRate) {
        this.spawnRate = spawnRate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void spawn(){

    }

    @Override
    public void effects() {

    }
}
