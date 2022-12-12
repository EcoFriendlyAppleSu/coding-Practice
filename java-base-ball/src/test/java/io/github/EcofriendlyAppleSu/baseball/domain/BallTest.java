package io.github.EcofriendlyAppleSu.baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallTest {


  @Test
  public void ballNumberAllowTest() throws Exception {
    assertDoesNotThrow(() -> Ball.of(5, 1));
  }

}
