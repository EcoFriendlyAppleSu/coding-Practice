package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.Balls;
import io.github.EcofriendlyAppleSu.baseball.domain.Computer;
import io.github.EcofriendlyAppleSu.baseball.domain.Referee;
import io.github.EcofriendlyAppleSu.baseball.domain.UserBall;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleIn;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOutMessage;
import io.github.EcofriendlyAppleSu.baseball.util.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        ConsoleOutMessage.GAME_START_MESSAGE.print();
        Balls computerBalls = new Computer().generateThreeBall(new RandomGenerator());
        Balls userBalls = new UserBall().createUserBall(ConsoleIn.userGameNumber());

        Referee.from(userBalls, computerBalls);
    }
}
