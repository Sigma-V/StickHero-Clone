package org.example;

public class Game implements Serializable{
    private int gameId;
    private int numCherry;
    private boolean hasRevived;
    private boolean isAlive;
    private int currentScore;
    private Hero hero;
    private Background background;
    private Stick stick;

    public Game(Hero hero, Background background, Stick stick, int numCherry, boolean hasRevived, boolean isAlive, int currentScore){

    }

    public boolean gethasRevived(){
        return hasRevived;
    }

    public boolean getisAlive(){
        return isAlive;
    }
    public Background getBackground() {
        return background;
    }

    public Hero getHero() {
        return hero;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public int getGameId() {
        return gameId;
    }

    public int getNumCherry() {
        return numCherry;
    }

    public Stick getStick() {
        return stick;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public void setHasRevived(boolean hasRevived) {
        this.hasRevived = hasRevived;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setNumCherry(int numCherry) {
        this.numCherry = numCherry;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public void pauseGame(){

    }

    public void initialiseGame(){

    }
}
