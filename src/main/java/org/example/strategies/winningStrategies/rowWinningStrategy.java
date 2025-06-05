package org.example.strategies.winningStrategies;

import org.example.models.*;

import java.util.HashMap;
import java.util.Map;

public class rowWinningStrategy implements WinningStrategy{

    private Map<Integer , HashMap<Character , Integer>> rowMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Character aChar = move.getPlayer().getSymbol().getaChar();

        if(!rowMap.containsKey(row)){
            rowMap.put(row , new HashMap<>());
        }

        if(!rowMap.get(row).containsKey(aChar)){

            rowMap.get(row).put(aChar , 0);

        }

        rowMap.get(row).put(aChar , rowMap.get(row).get(aChar) + 1);

        if(rowMap.get(row).get(aChar).equals(board.getDimension())){
            return true;
        }

        return false;
    }
}
