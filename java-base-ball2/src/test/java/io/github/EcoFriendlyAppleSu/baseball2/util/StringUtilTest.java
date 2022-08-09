package io.github.EcoFriendlyAppleSu.baseball2.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    StringUtil stringUtil = null;

    @BeforeEach
    void setUp() {
        stringUtil = new StringUtil();
    }

    @DisplayName("String To List<Integer> Test")
    @ParameterizedTest
    @ValueSource(strings = {"123", "345"})
    public void stringToListIntegerTest(String input) throws Exception {
        List<Integer> integerList = Stream.of(stringSplit(input)).map(x -> Integer.valueOf(x)).collect(Collectors.toList());
        Assertions.assertThat(stringUtil.stringToIntegerList(input)).isEqualTo(integerList);
    }

    private String[] stringSplit(String str) {
        return str.split("");
    }

}