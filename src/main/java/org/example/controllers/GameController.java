package org.example.controllers;

import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Player;
import org.example.strategies.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {

    public static Game startGame(int dimension , List<Player> players , List<WinningStrategy> winningStrategies){

        return  Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(){

    }

    public GameState checkGameState(Game game){

        return game.getGameState();

    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void printBoard(Game game){
        game.printBoar();
    }





}
