package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.util.StringToNumberList;

import java.util.List;

public class PlayGame {

    public void gameStart() {
        // computer number generate
        Balls answer = new Balls(GenerateRandomNumber.generateRandomNumber());
        answer.printBall();

        while (true) {
            List<Integer> userNumber = UserInput.input(); // user input
            PlayResult play = answer.play(userNumber);
            System.out.println(play.toString());
            if (play.isGameEnd()) {
                System.out.println("3 STRIKE!");
                System.out.println("1 : 다른 게임 2: 종료");
                Integer againInteger = UserInput.againAskInputNumber();
                if (isGameAgain(againInteger)) {
                    play.clear();
                    answer = new Balls(GenerateRandomNumber.generateRandomNumber());
                    answer.printBall();
                    continue;
                }
                if (isGameFinish(againInteger)) {
                    System.out.println("게임이 종료되었습니다.");
                    break;
                }

            }
        }

    }

    private boolean isGameFinish(Integer againInteger) {
        return againInteger == 2;
    }

    private boolean isGameAgain(Integer integer) {
        return integer == 1;
    }
}
