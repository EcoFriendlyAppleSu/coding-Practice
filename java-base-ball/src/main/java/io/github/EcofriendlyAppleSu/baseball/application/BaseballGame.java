package io.github.EcofriendlyAppleSu.baseball.application;

import io.github.EcofriendlyAppleSu.baseball.domain.RandomNumberGenerator;
import io.github.EcofriendlyAppleSu.baseball.infra.ConsoleOut;

public class BaseballGame {

  private final RandomNumberGenerator randomNumberGenerator;

  private BaseballGame(RandomNumberGenerator randomNumberGenerator) {
    this.randomNumberGenerator = randomNumberGenerator;
  }

  public static BaseballGame Init(RandomNumberGenerator randomNumberGenerator) {
    return new BaseballGame(randomNumberGenerator);
  }
}
