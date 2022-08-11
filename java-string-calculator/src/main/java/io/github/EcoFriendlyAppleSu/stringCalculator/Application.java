package io.github.EcoFriendlyAppleSu.stringCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        String str = "-1";
        Calculator calculator = new Calculator();
        int init = calculator.init(str);
        System.out.println(init);
    }
}
