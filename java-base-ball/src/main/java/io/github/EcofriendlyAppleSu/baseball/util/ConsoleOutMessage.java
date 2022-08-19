package io.github.EcofriendlyAppleSu.baseball.util;

public enum ConsoleOutMessage {


    GAME_START_MESSAGE("게임을 시작합니다."),
    BALL_NUMBER_OUT_OF_RANGE_MESSAGE("1 부터 9 사이의 숫자를 입력해야 합니다."),
    LOCATION_OUT_OF_INDEX("0 부터 2 사이의 숫자를 입력해야 합니다."),
    USER_INFO_MESSAGE("세 자리의 숫자를 입력해 주세요"),
    GAME_FINISH_MESSAGE("게임이 종료됩니다.");

    public final String message;

    ConsoleOutMessage(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println(this.message);
    }
}
