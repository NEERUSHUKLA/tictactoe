package org.example;

import org.example.controllers.GameController;
import org.example.exceptions.InvalidMoveException;
import org.example.models.*;
import org.example.strategies.winningStrategies.WinningStrategy;

import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        System.out.println("GameStarts!");
        Scanner scn = new Scanner(System.in);
        GameController gameController = new GameController();

//        int dimension = scn.nextInt();

        int dimension = 3;

        List<Player> players = new ArrayList<>();
        players.add(
                new Player(new Symbol('O') , "neeru" , PlayerType.HUMAN)
        );

        players.add(
                new Player(new Symbol('X') , "bot" , PlayerType.BOT)
        );





        List<WinningStrategy> winningStrategies = new ArrayList<>();

        Game game = GameController.startGame(dimension , players , winningStrategies);

//       gameController.printBoard(game);

        while(gameController.checkGameState(game).equals(GameState.IN_PROGRESS)){
            //1 show the board
            // make move
            game.printBoar();

            System.out.println("Do you want to undo ? y/n");
            String isUndo = scn.next();

            if(isUndo.equalsIgnoreCase("y")){
                //take the undo operation
                gameController.undo(game);
                continue;
            }else{
                gameController.makeMove(game);
            }

            //

        }

        System.out.println("DEBUG");


    }
}