package io.github.EcoFriendlyAppleSu.stringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void stringSeparatorTest() throws Exception {
        //given
        String str = "1 + 2 + 3";

        //when
        String[] expectedStrings = new String[]{"1", "+", "2", "+", "3"};

        //then
        assertThat(StringUtils.separator(str)).isEqualTo(expectedStrings);
    }

    @Test
    public void stringToIntegerTest() throws Exception {
        String str = "3";
        assertThat(StringUtils.ToInt(str)).isEqualTo(3);
    }

}