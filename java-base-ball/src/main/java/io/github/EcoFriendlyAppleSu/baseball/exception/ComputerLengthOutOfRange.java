package io.github.EcoFriendlyAppleSu.baseball.exception;

public class ComputerLengthOutOfRange extends StringIndexOutOfBoundsException {

    public ComputerLengthOutOfRange() {
    }

    public ComputerLengthOutOfRange(String s) {
        super(s);
    }
}
