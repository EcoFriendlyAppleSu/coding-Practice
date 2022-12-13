package io.github.EcofriendlyAppleSu.baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import io.github.EcofriendlyAppleSu.baseball.Report;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BallsTest {

  Balls computerBalls;

  @BeforeEach
  void setUp() {
    computerBalls = new Balls(List.of(1, 2, 3));
  }

  @Test
  public void ballsCreationAllowTest() throws Exception {
    List<Integer> balls = List.of(1, 2, 3);
    assertDoesNotThrow(() -> Balls.from(balls));
  }

  @Test
  public void amountOfBallExceptionTest() throws Exception {
    List<Integer> balls = List.of(1, 2, 3,4);
    Assertions.assertThatThrownBy(() -> Balls.from(balls))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  public void elementCheckTest() throws Exception {
    Ball ball1 = Ball.of(1, 0);
    Ball ball2 = Ball.of(2, 1);
    Ball ball3 = Ball.of(3, 2);

    List<Integer> integersBalls = List.of(1, 2, 3);
    Balls balls = Balls.from(integersBalls);

    Assertions.assertThat(balls.currentBalls()).contains(ball1, ball2, ball3);
  }


  @Test
  public void ThreeStrikeTest() throws Exception {
    Balls userBalls = Balls.from(List.of(1, 2, 3));
    Assertions.assertThat(computerBalls.matches(userBalls).printResult()).isEqualTo("0 볼, 3스트라이크");
  }
}
