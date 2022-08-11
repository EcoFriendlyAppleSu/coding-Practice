package io.github.EcoFriendlyAppleSu.stringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StringSeparatorTest {

    StringSeparator sep = null;

    @BeforeEach
    void setUp() {
        sep = new StringSeparator();
    }

    @DisplayName("String has comma Case Test")
    @ParameterizedTest
    @ValueSource(strings = {"1", "1,2", "3,4"})
    public void commaSepTest(String input) throws Exception {
        assertThat(sep.deletionWithoutNumber(input)).isEqualTo(input.split(","));
    }

    @DisplayName("String has comma and colon Case Test")
    @ParameterizedTest
    @ValueSource(strings = {"1,:", "1:2", "3,4"})
    public void commaAndColonSepTest(String input) throws Exception {
        assertThat(sep.deletionWithoutNumber(input)).isEqualTo(input.split(",|:"));
    }
    
    @Test
    public void stringUsingRegexTest() throws Exception {
        Matcher matcher = Pattern.compile("-?\\d+").matcher("//;\n1;2;3");
        ArrayList<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group());
        }
        assertThat(sep.deletionWithoutNumber("//;\n1;2;3")).isEqualTo(result.toArray(new String[0]));
    }
}
