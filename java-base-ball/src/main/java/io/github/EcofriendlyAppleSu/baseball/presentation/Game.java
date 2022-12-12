package io.github.EcofriendlyAppleSu.baseball.presentation;

import io.github.EcofriendlyAppleSu.baseball.application.BaseballGame;
import io.github.EcofriendlyAppleSu.baseball.infra.ConsoleOut;
import io.github.EcofriendlyAppleSu.baseball.infra.RandomNumberGeneratorImpl;

public class Game {

  public static void run() {
    ConsoleOut.GAME_INIT_MESSAGE.print();
    BaseballGame.Init(new RandomNumberGeneratorImpl());
  }

}
