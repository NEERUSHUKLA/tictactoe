package org.example.factory;

import org.example.models.BotDifficultyLevel;
import org.example.strategies.botPlayingStrategies.BotPlayingStrategy;
import org.example.strategies.botPlayingStrategies.EasyBotPlayingStrategies;
import org.example.strategies.botPlayingStrategies.HardBotPlayingStrategies;
import org.example.strategies.botPlayingStrategies.MediumPlayingStrategies;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyFactory(BotDifficultyLevel botDifficultyLevel){

        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY) ){
            return new EasyBotPlayingStrategies();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumPlayingStrategies();
        }else{
            return new HardBotPlayingStrategies();
        }

    }
}
