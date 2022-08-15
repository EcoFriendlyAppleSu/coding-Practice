package io.github.EcoFriendlyAppleSu.carRacing;

import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleIn;
import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleOut;

public class GamePlay {

    private GamePlay() {
    }
    public static void init() {
        System.out.println(ConsoleOut.GAME_START_MESSAGE);
        String userInput = ConsoleIn.carNameInput();
        System.out.println(ConsoleOut.GAME_TIMES);
        int userInputTime = ConsoleIn.carMovingTime();
        Cars result = new Cars(userInput, userInputTime);
        result.carsMovingTimes();
        result.findWinner();
    }
}
