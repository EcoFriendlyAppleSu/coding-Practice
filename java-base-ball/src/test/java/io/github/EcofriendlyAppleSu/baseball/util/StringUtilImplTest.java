package io.github.EcofriendlyAppleSu.baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilImplTest {

    @Test
    void stringUtilResultTest() throws Exception {
        StringUtil stringUtil = new StringUtilImpl();
        Assertions.assertThat(stringUtil.stringToIntegerList("123")).isEqualTo(Arrays.asList(1, 2, 3));
    }

}
