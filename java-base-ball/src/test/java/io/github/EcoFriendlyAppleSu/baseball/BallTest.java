package io.github.EcoFriendlyAppleSu.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/*
* Ball의 역할은 자릿수를 확인하는 역할이야 valid 역할은 BallNumber, Location에 있어
* 상태와 행동을 구분해서 살펴보자
*/
public class BallTest {


    @DisplayName("Ball NothingCase Test - Different Number Different Location")
    @Test
    public void ballNothingCaseTest() throws Exception{
        Ball computer = new Ball(1, 3);
        Ball user = new Ball(2, 1);
        assertThat(computer.matchBall(user)).isEqualTo(BallStatus.NOTHING);
    }

    @DisplayName("Ball BallCase Test - Same Number Different Location")
    @Test
    public void ballBallCaseTest() throws Exception{
        Ball computer = new Ball(1, 3);
        Ball user = new Ball(1, 1);
        assertThat(computer.matchBall(user)).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("Ball StrikeCase Test - Same Number Same Location")
    @Test
    public void ballStrikeCaseTest() throws Exception{
        Ball computer = new Ball(1, 3);
        Ball user = new Ball(1, 3);
        assertThat(computer.matchBall(user)).isEqualTo(BallStatus.STRIKE);
    }
    
}
