package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.Player;
import io.github.EcofriendlyAppleSu.baseball.domain.Referee;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleIn;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;

public class BaseBall {
    public static void Init() {
        BaseBallConfig config = new BaseBallConfig();
        System.out.println(ConsoleOut.GAME_START_MESSAGE);
        Player computer = config.ComputerInit();
        Player gamer = config.GamerInit(ConsoleIn.userInput());

        Referee referee = config.RefereeInit(computer, gamer);
        referee.matchBalls();
    }
}
