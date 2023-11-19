package org.example;

public class GameFinishedMenu implements DisplayScreens{

    private Game game;

    public GameFinishedMenu(Game game){

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void restartGame() throws GameCannotBeRestartedException{

    }

    @Override
    public void displayOptions() {

    }

    @Override
    public void exit() {

    }
}
