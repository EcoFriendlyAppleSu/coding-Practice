package io.github.EcofriendlyAppleSu.baseball.util;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AtomicReferenceFieldUpdaterAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilTest {

    @DisplayName("세 자리 다른 수와 일의 자리 숫자가 들어 왔을 때")
    @Test
    public void differentThreeNumbersTest() throws Exception {
        assertThat(ValidationUtil.validate(Arrays.asList(1, 2, 3))).isEqualTo(true);
    }

    @DisplayName("중복 된 숫자가 들어 왔을 때")
    @Test
    public void duplicationBallNumberTest() throws Exception {
        assertThat(ValidationUtil.validate(Arrays.asList(1, 1, 3))).isEqualTo(false);
    }

    @DisplayName("Ball Number Out Of Range Test")
    @Test
    public void ballNumberOutOfRangeTest() throws Exception {
        assertThat(ValidationUtil.validate(Arrays.asList(-1, 9, 3))).isEqualTo(false);
    }

    @DisplayName("Less than amount of ball")
    @Test
    public void ballSizeTest() throws Exception {
        assertThat(ValidationUtil.validate(Arrays.asList(1, 3))).isEqualTo(false);
    }

}