package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.Computer;
import io.github.EcofriendlyAppleSu.baseball.domain.Gamer;
import io.github.EcofriendlyAppleSu.baseball.domain.Player;
import io.github.EcofriendlyAppleSu.baseball.domain.Referee;
import io.github.EcofriendlyAppleSu.baseball.util.*;

import java.util.List;

public class BaseBallConfig {

    public Referee RefereeInit(Player computer, Player gamer) {
        return Referee.of(computer, gamer);
    }

    public Player GamerInit(String userInput) {
        return Gamer.from(userInput);
    }

    public Player ComputerInit() {
        return Computer.from(generateNumberInit());
    }

    /*public StringUtil stringUtilService() {
        return new StringUtilImpl();
    }*/

    public GenerateNumber generateNumberInit() {
        return new GenerateNumberImpl();
    }
}
