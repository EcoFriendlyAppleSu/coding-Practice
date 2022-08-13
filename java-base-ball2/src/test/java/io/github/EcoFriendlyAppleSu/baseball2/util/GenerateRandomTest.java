package io.github.EcoFriendlyAppleSu.baseball2.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

class GenerateRandomTest {

    @RepeatedTest(10)
    public void generateThreeSizeStringTest() throws Exception{
        GenerateRandom generateRandom = new GenerateRandom();
        List<Integer> generate = generateRandom.generate();
        Assertions.assertThat(generate.stream().mapToInt(x -> x).sum()).isGreaterThanOrEqualTo(6).isLessThanOrEqualTo(24);
    }
}