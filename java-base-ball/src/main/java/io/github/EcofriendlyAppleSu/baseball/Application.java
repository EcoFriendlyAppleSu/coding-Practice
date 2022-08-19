package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.*;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleIn;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOutMessage;
import io.github.EcofriendlyAppleSu.baseball.util.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        ConsoleOutMessage.GAME_START_MESSAGE.print();
        ConsoleOutMessage.USER_INFO_MESSAGE.print();
        Balls computerBalls = new Computer().generateThreeBall(RandomGenerator.of());
        Balls userBalls = new UserBall().createUserBall(ConsoleIn.userGameNumber());
        Referee referee = Referee.from(userBalls, computerBalls);
        PlayResult play = referee.play();
        play.print();

    }
}
