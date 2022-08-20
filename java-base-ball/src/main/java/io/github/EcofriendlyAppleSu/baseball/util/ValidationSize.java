package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidationSize {

    public static List<Integer> isThreeDistinctRandomNumber(Generator generator) {
        return IntStream.range(0, 3).map(x -> generator.generator()).distinct().boxed().collect(Collectors.toList());
    }

}
 