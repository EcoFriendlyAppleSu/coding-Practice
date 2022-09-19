package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtilImpl implements StringUtil {


    @Override
    public List<Integer> stringToIntegerList(String input) {
        return Arrays.stream(splitString(input)).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
    }

    private String[] splitString(String input) {
        return input.split("");
    }
}
