package io.github.EcoFriendlyAppleSu.baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static org.assertj.core.api.Assertions.assertThat;

class GenerateRandomNumberTest {

    @RepeatedTest(10)
    public void generateThreeNumberTest() throws Exception{
        //given
        GenerateRandomNumber strategy = new GenerateRandomNumber();

        //when
        String randomNumbers = strategy.generateRandomNumberUsingStream();

        //then
        assertThat(distinctCount(randomNumbers)).isEqualTo(3);
        int result = sum(randomNumbers);
        System.out.println(result);
        assertThat(result).isGreaterThanOrEqualTo(6).isLessThanOrEqualTo(24);
    }

    private int sum(String randomNumbers) {
        return stream(randomNumbers.split(""))
                .mapToInt(Integer::valueOf)
                .sum();
    }

    private long distinctCount(String randomNumbers) {
        return stream(randomNumbers.split(""))
                .distinct()
                .count();
    }
}