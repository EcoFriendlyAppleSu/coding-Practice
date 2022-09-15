package io.github.EcoFriendlyAppleSu.stringCalculator.exception;

public class DivideZeroException extends ArithmeticException {
    public DivideZeroException() {
    }

    public DivideZeroException(String s) {
        super(s);
    }
}
