package org.example;

public class DifficultyMenu implements DisplayScreens{

    private float stickSpeed;
    private float heroSpeed;

    public DifficultyMenu(){

    }

    public float getHeroSpeed() {
        return heroSpeed;
    }

    public float getStickSpeed() {
        return stickSpeed;
    }

    public void setHeroSpeed(float heroSpeed) {
        this.heroSpeed = heroSpeed;
    }

    public void setStickSpeed(float stickSpeed) {
        this.stickSpeed = stickSpeed;
    }


    public void changeStickSpeed(){

    }

    public void changeHeroSpeed(){

    }

    @Override
    public void displayOptions() {

    }

    @Override
    public void exit() {

    }
}
