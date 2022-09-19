package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.Player;

public class BaseBall {
    public static void Init() {
        BaseBallConfig baseBallConfig = new BaseBallConfig();
        Player computer = baseBallConfig.ComputerInit();
        Player gamer = baseBallConfig.GamerInit();
    }
}
