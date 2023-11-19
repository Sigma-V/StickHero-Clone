package org.example;

public class GameObject implements Serializable {
    private int id;
    private float xCoordinate;
    private float yCoordinate;

    public GameObject(int id, int xCoordinate, int yCoordinate){

    }

    public int getId() {
        return id;
    }

    public float getxCoordinate() {
        return xCoordinate;
    }

    public float getyCoordinate() {
        return yCoordinate;
    }

    public void spawn(){

    }
}
