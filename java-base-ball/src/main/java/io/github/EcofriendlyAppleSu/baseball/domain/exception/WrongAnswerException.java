package io.github.EcofriendlyAppleSu.baseball.domain.exception;

public class WrongAnswerException extends IllegalArgumentException {
    public WrongAnswerException() {
    }

    public WrongAnswerException(String s) {
        super(s);
    }
}
