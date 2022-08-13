package io.github.EcoFriendlyAppleSu.carRacing.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomGenerateUtilTest {

    @Test
    public void randomNumberGenerateTest() throws Exception {
        RandomGenerateUtil util = new RandomGenerateUtil();
        assertThat(util.generate()).isGreaterThanOrEqualTo(4).isLessThanOrEqualTo(9).isEqualTo(1);
    }

}