package io.github.EcofriendlyAppleSu.baseball.infra;

public enum ConsoleOut {

  GAME_INIT_MESSAGE("게임을 시작합니다."),
  USER_NUMBER_INPUT_MESSAGE("숫자를 입력해 주세요 :"),
  THREE_STRIKE_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
  NEW_GAME_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
  GAME_FINISH_MESSAGE("게임을 종료합니다."),
  GAME_RESTART_MESSAGE("게임을 새로 시작합니다.");

  private String message;

  ConsoleOut(String message) {
    this.message = message;
  }

  public void print() {
    System.out.println(message);
  }
}
