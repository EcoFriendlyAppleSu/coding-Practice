package io.github.EcoFriendlyAppleSu.carRacing;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        String[] strings = {"rjek", "rjek34", "r,,,32", "123,456,09,", "asb#$'"};
        String regex = "^[a-zA-Z0-9,]+$";
        Pattern compile = Pattern.compile(regex);

        for (String eachString : strings) {
            Matcher matcher = compile.matcher(eachString);
            if (matcher.find()) {
                String[] split = matcher.group().split(",");
                System.out.println(Arrays.toString(split));
            }
        }

        /*for (String eachString : strings) {
            if (eachString.chars().allMatch(Character::isAlphabetic) || eachString.chars().allMatch(Character::isDigit)) {
                System.out.println(eachString + " is alpha");
            }
        }*/
    }
}
