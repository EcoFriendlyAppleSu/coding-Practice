package io.github.EcofriendlyAppleSu.baseball.infra;

public enum ConsoleOut {

  GAME_INIT_MESSAGE("게임을 시작합니다.");


  private String message;

  ConsoleOut(String message) {
    this.message = message;
  }

  public void print() {
    System.out.println(message);
  }
}
