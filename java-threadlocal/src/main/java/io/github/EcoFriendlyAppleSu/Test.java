package io.github.EcoFriendlyAppleSu;

public enum Test {
  A("a"), B("b");

  private String message;
  Test(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
