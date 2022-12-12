package io.github.EcofriendlyAppleSu.baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import io.github.EcofriendlyAppleSu.baseball.domain.enums.BallStatus;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {

  private Ball ball;

  @BeforeEach
  void setUp() {
    ball = Ball.of(5, 1);
  }


  @Test
  public void ballNumberAllowTest() throws Exception {
    assertDoesNotThrow(() -> Ball.of(5, 1));
  }

  @DisplayName("주어진 공과 비교했을 때, 공 숫자와 위치 둘 다 틀릴 경우 - BALL")
  @Test
  public void ballBallCaseTest() throws Exception {
    assertThat(Ball.of(6, 0).matchBall(ball)).isEqualTo(BallStatus.BALL);
  }

}
