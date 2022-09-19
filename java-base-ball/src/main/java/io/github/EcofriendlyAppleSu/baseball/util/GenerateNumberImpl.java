package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateNumberImpl implements GenerateNumber {

    @Override
    public List<Integer> generator() {
        return Stream.generate(new Random()::ints)
                .flatMap(IntStream::boxed)
                .distinct().limit(3).collect(Collectors.toList());
    }
}
