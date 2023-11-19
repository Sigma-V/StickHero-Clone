package org.example;

public class GamePausedMenu implements DisplayScreens{

    private Game game;

    public GamePausedMenu(Game game){


    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void resumeGam() throws GameCannotBeContinuedException{

    }

    public void saveGame() throws GameCannotBeContinuedException{

    }

    @Override
    public void displayOptions() {

    }

    @Override
    public void exit() {

    }
}
