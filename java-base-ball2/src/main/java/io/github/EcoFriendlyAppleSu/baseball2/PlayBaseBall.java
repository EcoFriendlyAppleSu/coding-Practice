package io.github.EcoFriendlyAppleSu.baseball2;

import io.github.EcoFriendlyAppleSu.baseball2.domain.GameResult;
import io.github.EcoFriendlyAppleSu.baseball2.domain.Referee;
import io.github.EcoFriendlyAppleSu.baseball2.domain.User;
import io.github.EcoFriendlyAppleSu.baseball2.util.ConsoleInput;
import io.github.EcoFriendlyAppleSu.baseball2.util.ConsoleOutput;
import io.github.EcoFriendlyAppleSu.baseball2.util.GenerateRandom;

import java.util.List;

public class PlayBaseBall {

    private PlayBaseBall() {
    }

    public static void start() {

        System.out.println(ConsoleOutput.GAME_START);
        Referee computer = new Referee(new GenerateRandom().generate());
        System.out.println(computer.toString());
        List<Integer> userInput = new ConsoleInput().scannerNextLine();

        GameResult gameResult = computer.printResultGame(userInput);
        System.out.println(gameResult.toString());
    }
}
