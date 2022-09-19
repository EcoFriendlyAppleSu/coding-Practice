package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.ConsoleIn;
import io.github.EcofriendlyAppleSu.baseball.util.StringUtil;

import java.util.List;

public class Gamer implements Player {

    private Balls balls;

    private Gamer(List<Integer> userBalls) {
        balls = Balls.from(userBalls);
    }

    public static Gamer from(String userInput) {
        return new Gamer(StringUtil.stringToIntegerList(userInput));
    }

    public void ballSettingAgain() {
        balls = Balls.from(StringUtil.stringToIntegerList(ConsoleIn.userInput()));
    }

    @Override
    public List<Ball> currentBalls() {
        return balls.currentBalls();
    }
}
