package io.github.EcofriendlyAppleSu.baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import io.github.EcofriendlyAppleSu.baseball.domain.Ball;
import io.github.EcofriendlyAppleSu.baseball.domain.enums.BallStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReportTest {

  @Test
  public void ballTest() throws Exception {
    Report report = new Report();

    BallStatus ballStatus = BallStatus.BALL;

    report.countBall(ballStatus);
    assertThat(report.currentBallCount()).isEqualTo(1);
  }

  @Test
  public void strikeTest() throws Exception {
    Report report = new Report();

    BallStatus ballStatus = BallStatus.STRIKE;

    report.countBall(ballStatus);
    assertThat(report.currentStrikeCount()).isEqualTo(1);
  }

}
