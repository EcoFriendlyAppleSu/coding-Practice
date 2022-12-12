package io.github.EcofriendlyAppleSu.baseball.infra;

public enum ConsoleOut {

  GAME_INIT_MESSAGE("게임을 시작합니다."),
  USER_NUMBER_INPUT_MESSAGE("숫자를 입력해 주세요 :");


  private String message;

  ConsoleOut(String message) {
    this.message = message;
  }

  public void print() {
    System.out.println(message);
  }
}
