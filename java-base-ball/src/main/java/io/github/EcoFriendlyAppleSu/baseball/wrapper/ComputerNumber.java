package io.github.EcoFriendlyAppleSu.baseball.wrapper;

import io.github.EcoFriendlyAppleSu.baseball.exception.ComputerLengthOutOfRange;

/*
* Role : computer has 3 length
* Responsibility : 오직 3자리 문자열만 가져야 하는 책임
* Collaboration : ComputerLengthOutOfRange 예외 처리 객체와 협력
*/
public class ComputerNumber {

    private String input;
    private static int STRING_LENGTH = 3;

    public ComputerNumber(String input) {
        if (isNotLength(input)) {
            throw new ComputerLengthOutOfRange("오직 3 자리 숫자만 가능합니다.");
        }
        this.input = input;
    }

    private boolean isNotLength(String input) {
        return input.length() != STRING_LENGTH;
    }
}
