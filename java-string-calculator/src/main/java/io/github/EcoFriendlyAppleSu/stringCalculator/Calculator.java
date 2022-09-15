package io.github.EcoFriendlyAppleSu.stringCalculator;

public class Calculator {

    public static void init() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.makeResult(ConsoleIn.UserInput());
        System.out.println("result = " + result);
    }
}
