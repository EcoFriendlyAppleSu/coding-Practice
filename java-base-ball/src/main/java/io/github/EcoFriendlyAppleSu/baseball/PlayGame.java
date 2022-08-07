package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.util.StringToNumberList;

import java.util.List;

public class PlayGame {

    public static void gameStart() {
        Balls answer = new Balls(GenerateRandomNumber.generateRandomNumber());
        answer.printBall();

        while (true) {
            List<Integer> userNumber = UserInput.input(); // user input
            PlayResult play = answer.play(userNumber);
            System.out.println(play.toString());
            if (play.isGameEnd()) {
                Integer againInteger = UserInput.againAskInputNumber();
                if (isGameAgain(againInteger)) {
                    play.clear();
                    answer = new Balls(GenerateRandomNumber.generateRandomNumber());
                    System.out.println("새로운 게임이 시작되었습니다.!!");
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

    private static boolean isGameFinish(Integer againInteger) {
        return againInteger == 2;
    }

    private static boolean isGameAgain(Integer integer) {

        return integer == 1;
    }
}
