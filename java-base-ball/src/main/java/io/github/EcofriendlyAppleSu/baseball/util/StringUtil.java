package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public static List<Integer> stringToIntegerList(String input) {
        return Arrays.stream(splitString(input)).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
    }

    private static String[] splitString(String input) {
        return input.split("");
    }
}
