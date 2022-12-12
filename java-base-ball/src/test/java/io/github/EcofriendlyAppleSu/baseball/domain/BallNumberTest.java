package io.github.EcofriendlyAppleSu.baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BallNumberTest {

  @Test
  public void ballNumberAllowTest() throws Exception {
    Assertions.assertDoesNotThrow(() -> BallNumber.from(5));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 10})
  public void ballNumberOutOfBoundException(int inputNumber) throws Exception {
    org.assertj.core.api.Assertions.assertThatThrownBy(() -> BallNumber.from(inputNumber))
        .isInstanceOf(BallNumberOutOfRangeException.class);
  }

}
