package org.example.strategies.winningStrategies;

import org.example.models.Board;
import org.example.models.Move;

import java.util.HashMap;
import java.util.Map;

public class colWinningStrategy implements WinningStrategy{

    Map<Integer , HashMap<Character , Integer>> colMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Character aChar = move.getPlayer().getSymbol().getaChar();

        if(!colMap.containsKey(col)){
            colMap.put(col , new HashMap<>());
        }

        if(!colMap.get(col).containsKey(aChar)){
            colMap.get(col).put(aChar , 0);
        }

        colMap.get(col).put(aChar , colMap.get(col).get(aChar) + 1 );

        if(colMap.get(col).get(aChar).equals(board.getDimension())) {
            return true;
        }

        return false;
    }
}
