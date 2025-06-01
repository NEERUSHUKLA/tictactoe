package org.example.models;

import org.example.factory.BotPlayingStrategyFactory;
import org.example.strategies.botPlayingStrategies.BotPlayingStrategy;

public class Bot  extends Player{



    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategies;

    public Bot(Symbol symbol, String name, PlayerType playerType, BotDifficultyLevel botDifficultyLevel, BotPlayingStrategy botPlayingStrategies) {
        super(symbol, name, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategies = BotPlayingStrategyFactory.getBotPlayingStrategyFactory(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategies() {
        return botPlayingStrategies;
    }

    public void setBotPlayingStrategies(BotPlayingStrategy botPlayingStrategies) {
        this.botPlayingStrategies = botPlayingStrategies;
    }
}
