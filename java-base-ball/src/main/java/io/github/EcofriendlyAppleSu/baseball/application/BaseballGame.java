package io.github.EcofriendlyAppleSu.baseball.application;

import io.github.EcofriendlyAppleSu.baseball.Report;
import io.github.EcofriendlyAppleSu.baseball.domain.Balls;
import io.github.EcofriendlyAppleSu.baseball.domain.RandomNumberGenerator;
import io.github.EcofriendlyAppleSu.baseball.infra.ConsoleIn;
import io.github.EcofriendlyAppleSu.baseball.infra.ConsoleOut;
import io.github.EcofriendlyAppleSu.baseball.infra.RandomNumberGeneratorImpl;
import io.github.EcofriendlyAppleSu.baseball.infra.ValueChanger;
import java.util.List;

public class BaseballGame {

  private static RandomNumberGenerator randomNumberGenerator = new RandomNumberGeneratorImpl();

  public static void Init() {
    boolean flag = true;
    ConsoleOut.GAME_INIT_MESSAGE.print();
    while (true) {
      var generatedString = randomNumberGenerator.generator();
      var computerBalls = Balls.from(ValueChanger.run(generatedString));

      while (true) {

        var inputString = ConsoleIn.gameBallNumberInput();
        var userBalls = Balls.from(ValueChanger.run(inputString));
        var report = computerBalls.matches(userBalls);

        System.out.println(report.printResult());

        if (report.currentStrikeCount() == 3) {
          ConsoleOut.THREE_STRIKE_MESSAGE.print();
          ConsoleOut.NEW_GAME_MESSAGE.print();
          var restartInput = ConsoleIn.reStartInput();
          if (restartInput.equals("1")) {
            ConsoleOut.GAME_RESTART_MESSAGE.print();
            break;
          }
          flag = false;
          break;
        }

      }
      if (flag == false) {
        ConsoleOut.GAME_FINISH_MESSAGE.print();
        break;
      }
    }
  }
}
