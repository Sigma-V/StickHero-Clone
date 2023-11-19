package org.example;
import java.util.*;
public class SavedGamesMenu implements DisplayScreens{
    private ArrayList<Game> savedGames;

    public SavedGamesMenu(){

    }

    public ArrayList<Game> getSavedGames() {
        return savedGames;
    }

    public void setSavedGames(ArrayList<Game> savedGames) {
        this.savedGames = savedGames;
    }

    public void openSavedGame() throws GameNotFoundException{


    }

    public void removeSavedGame(){

    }


    @Override
    public void displayOptions() {

    }

    @Override
    public void exit() {

    }
}
