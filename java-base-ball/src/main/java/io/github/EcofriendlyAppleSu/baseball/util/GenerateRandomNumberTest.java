package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateRandomNumberTest {

    private Generator generator = null;

    public GenerateRandomNumberTest(Generator generator) {
        this.generator = generator;
    }

    public List<Integer> test() {
        return IntStream.range(0, 3).map(x -> generator.generator()).distinct().boxed().collect(Collectors.toList());
    }
}
