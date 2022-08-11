package io.github.EcoFriendlyAppleSu.stringCalculator;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSeparator {

    private static String sepPattern = ",|:";
    private static String pattern = "-?\\d+";
    public String [] deletionWithoutNumber(String text) {
        return stringSepUsingRegex(text);
    }

    private String[] stringSepUsingRegex(String text) {
        Pattern compile = Pattern.compile(pattern);
        return compile.matcher(text).results()
                .map(MatchResult::group).toArray(String[]::new);
    }
}
