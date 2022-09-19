package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.Computer;
import io.github.EcofriendlyAppleSu.baseball.domain.Gamer;
import io.github.EcofriendlyAppleSu.baseball.domain.Player;
import io.github.EcofriendlyAppleSu.baseball.util.*;

import java.util.List;

public class BaseBallConfig {

    /*public void GameStart() {

    }*/

    public Player GamerInit() {
        return Gamer.from(stringUtilService());
    }

    public Player ComputerInit() {
        return Computer.from(generateRandomNumberService());
    }

    private List<Integer> generateRandomNumberService() {
        return generateNumberInit().generator();
    }

    private GenerateNumber generateNumberInit() {
        return new GenerateNumberImpl();
    }

    private List<Integer> stringUtilService() {
        return stringUtilInit().stringToIntegerList(ConsoleIn.userInput());
    }

    private StringUtil stringUtilInit() {
        return new StringUtilImpl();
    }
}
