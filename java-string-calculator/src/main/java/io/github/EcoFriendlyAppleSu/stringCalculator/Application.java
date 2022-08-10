package io.github.EcoFriendlyAppleSu.stringCalculator;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        String str = "1,2:3";
        String[] split = str.split(",|:");
        List<String> strings = Arrays.asList(split); // return 1
        System.out.println(strings);
    }
}
