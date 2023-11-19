package org.example;

import java.io.IOException;

public class MainMenu implements DisplayScreens {
    private int highScore;
    private int totalCherries;

    public MainMenu(){

    }

    public int getHighScore() {
        return highScore;
    }

    public int getTotalCherries() {
        return totalCherries;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public void setTotalCherries(int totalCherries) {
        this.totalCherries = totalCherries;
    }

    public void startGame(){

    }

    public void continueSavedGame() throws IOException {

    }

    public void changeSkins(){

    }

    public void displayRules(){

    }

    public void changeDifficulty(){

    }


    @Override
    public void displayOptions() {


    }

    @Override
    public void exit() {

    }
}
