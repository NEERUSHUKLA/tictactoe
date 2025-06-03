package org.example;

import org.example.models.Game;
import org.example.models.Player;
import org.example.models.PlayerType;
import org.example.models.Symbol;
import org.example.strategies.winningStrategies.WinningStrategy;

import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("GameStarts!");
        Scanner scn = new Scanner(System.in);

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

        Game game = Game.getBuilder().setDimension(dimension)
                                     .setPlayers(players)
                                     .setWinningStrategies(winningStrategies)
                                     .build();

        System.out.println("DEBUG");


    }
}