package io.github.EcoFriendlyAppleSu.carRacing.utils;

import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleOut;
import io.github.EcoFriendlyAppleSu.carRacing.exception.StringTypeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplitUtil {

    private static String pattern = "^[a-zA-Z0-9,]+$";

    public String[] modificationStringToNameStrings(String input) {
        Pattern settingPattern = Pattern.compile(pattern);
        Matcher matcher = settingPattern.matcher(input);
        // 정규식을 통한 String 검증
        if (matcher.find() == false) {
            throw new StringTypeException(ConsoleOut.INPUT_TYPE_EXCEPTION_MESSAGE);
        }
        return input.split(",");
    }
}
