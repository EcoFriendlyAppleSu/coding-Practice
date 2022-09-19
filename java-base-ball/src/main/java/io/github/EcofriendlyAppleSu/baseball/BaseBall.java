package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.Player;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;

public class BaseBall {
    public static void Init() {
        BaseBallConfig baseBallConfig = new BaseBallConfig();
        System.out.println(ConsoleOut.GAME_START_MESSAGE);
        baseBallConfig.GameStart(); // computer init, gamer init


    }
}
