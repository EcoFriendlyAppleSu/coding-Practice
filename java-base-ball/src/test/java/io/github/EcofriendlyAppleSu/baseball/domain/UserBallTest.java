package io.github.EcofriendlyAppleSu.baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserBallTest {

    UserBall userBall = null;

    @BeforeEach
    void setUp() {
        userBall = new UserBall();
    }

    @Test
    public void createBallsTest() throws Exception {
        Balls balls = Balls.of(Arrays.asList(1, 2, 3));
        String str = "123";
        assertThat(userBall.createUserBall(str)).isEqualTo(balls);
    }

    @Test
    public void stringSplitTest() throws Exception {
        String str = "123";
        assertThat(userBall.stringSplit(str)).isEqualTo(str.split(""));
    }

    @Test
    public void stringsToListInteger() throws Exception {
        String[] strings = {"1", "3", "2"};
        assertThat(userBall.stringsToListInteger(strings)).isEqualTo(Arrays.asList(1, 3, 2));
    }

}