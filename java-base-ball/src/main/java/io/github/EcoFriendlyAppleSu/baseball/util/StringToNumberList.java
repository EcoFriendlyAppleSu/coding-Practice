package io.github.EcoFriendlyAppleSu.baseball.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
* String 으로 입력받는 값을 List<Integer>로 변환하는 Util Class
* */
public class StringToNumberList {
    public List<Integer> stringArrayToIntegerList(String str) {
        List<Integer> result = new ArrayList<>();
        for (String index : splitString(str)) {
            result.add(oneStringToInteger(index));
        }
        return result;
    }

    /*
     * mapToInt, map 차이 공유
     * */
    public List<Integer> stringArrayToIntegerListUsingStream(String str) {
        return Stream.of(splitString(str)).mapToInt(number -> Integer.valueOf(number)).boxed().collect(Collectors.toList());
    }

    private String[] splitString(String str) {
        return str.split("");
    }

    private Integer oneStringToInteger(String str) {
        return Integer.valueOf(str);
    }
}
