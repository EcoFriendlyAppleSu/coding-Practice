package io.github.EcoFriendlyAppleSu.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/*
* Ball의 역할은 자릿수를 확인하는 역할이야 valid 역할은 BallNumber, Location에 있어
* 상태와 행동을 구분해서 살펴보자
* Ball은 BallNumber와 Location (Wrapper Class) 상태를 갖고 match라는 메소드를 통해
* nothing, ball, strike 상태를 판단하는 역할을 하고 있어
*/
public class BallTest {

    Ball computer = null;

    @BeforeEach
    void setUp() {
        computer = new Ball(1, 3);
    }


    @DisplayName("Ball NothingCase Test - Different Number Different Location")
    @Test
    public void ballNothingCaseTest() throws Exception{
        assertThat(computer.matchBall(new Ball(2, 1))).isEqualTo(BallStatus.NOTHING);
    }

    @DisplayName("Ball BallCase Test - Same Number Different Location")
    @Test
    public void ballBallCaseTest() throws Exception{
        assertThat(computer.matchBall(new Ball(1, 1))).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("Ball StrikeCase Test - Same Number Same Location")
    @Test
    public void ballStrikeCaseTest() throws Exception{
        assertThat(computer.matchBall(new Ball(1, 3))).isEqualTo(BallStatus.STRIKE);
    }
    
}
