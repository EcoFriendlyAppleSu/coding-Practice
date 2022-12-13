package io.github.EcofriendlyAppleSu.baseball.infra;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorImplTest {

  @RepeatedTest(10)
  public void generateRandomNumberTest() throws Exception {
    RandomNumberGeneratorImpl randomNumberGenerator = new RandomNumberGeneratorImpl();
    String generator = randomNumberGenerator.generator();
    System.out.println(generator);
    Assertions.assertThat(generator.length()).isEqualTo(3);
  }

}
