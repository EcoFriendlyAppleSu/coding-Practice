package io.github.EcoFriendlyAppleSu.baseball2.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtil {
    public List<Integer> stringToIntegerList(String inputString) {

        return Stream.of(stringToSplit(inputString)).map(x-> Integer.valueOf(x)).collect(Collectors.toList());
    }

    private String[] stringToSplit(String str) {
        return str.split("");
    }
}
