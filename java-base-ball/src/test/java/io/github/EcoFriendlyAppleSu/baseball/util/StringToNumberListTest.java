package io.github.EcoFriendlyAppleSu.baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StringToNumberListTest {

    StringToNumberList util = null;
    String testString = "123";

    @BeforeEach
    void setUp() {
        util = new StringToNumberList();
    }

//    @DisplayName("String To String Array")
//    @Test
//    public void stringSplitTest() throws Exception{
//        String[] splitString = util.splitString(testString);
//        assertThat(testString.split("")).isEqualTo(splitString);
//    }

    @DisplayName("String Array To Integer List")
    @Test
    public void stringArrayToIntegerList() throws Exception{
        assertThat(util.stringArrayToIntegerList(testString)).isEqualTo(Stream.of(testString.split("")).map(Integer::valueOf).collect(Collectors.toList()));
    }

    @DisplayName("String Array To Integer List Using Stream")
    @Test
    public void stringToIntegerList() {
        assertThat(util.stringArrayToIntegerListUsingStream(testString)).isEqualTo(Stream.of(testString.split("")).map(Integer::valueOf).collect(Collectors.toList()));
    }
}
