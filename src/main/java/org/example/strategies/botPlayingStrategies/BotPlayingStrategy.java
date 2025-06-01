package org.example.strategies.botPlayingStrategies;

import org.example.models.Board;
import org.example.models.Move;

public interface BotPlayingStrategy {
    public Move  makeMode(Board board);
}
