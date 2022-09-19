package io.github.EcofriendlyAppleSu.baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StringUtilImplTest {

    @Test
    void stringUtilResultTest() throws Exception {
        Assertions.assertThat(StringUtil.stringToIntegerList("123")).isEqualTo(Arrays.asList(1, 2, 3));
    }

}
