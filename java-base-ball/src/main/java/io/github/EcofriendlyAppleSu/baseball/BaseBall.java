package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.GameReport;
import io.github.EcofriendlyAppleSu.baseball.domain.Player;
import io.github.EcofriendlyAppleSu.baseball.domain.Referee;
import io.github.EcofriendlyAppleSu.baseball.domain.exception.WrongAnswerException;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleIn;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;

public class BaseBall {
    public static void Init() {
        BaseBallConfig config = new BaseBallConfig();
        System.out.println(ConsoleOut.GAME_START_MESSAGE);
        Player computer = config.ComputerInit();
        Player gamer = config.GamerInit(ConsoleIn.userInput());
        Referee referee = config.RefereeInit(computer, gamer);

        while (true) {
            GameReport gameReport = referee.matchBalls();
            gameReport.printStrikeBallCount();
            if (gameReport.isThreeStrike()) {
                System.out.println(ConsoleOut.THREE_STRIKE_GAME_FINISH_MESSAGE);
                if (gameAgain()) {
                    continue;
                }
                break;
            }
            gamer.ballSettingAgain();
        }
    }

    private static boolean gameAgain() {
        String answer = ConsoleIn.userGameAgain();
        if (answer == "1") {
            return true;
        }
        if (answer == "2") {
            return false;
        }
        throw new WrongAnswerException();
    }
}
