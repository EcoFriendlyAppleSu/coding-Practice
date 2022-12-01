package io.github.EcoFriendlyAppleSu.thread;

public class OtherLogic {

  public void printMyNumber() {
    System.out.println(
        Thread.currentThread().getName() + " OtherLogic Value = " + ThreadLocalSample.get());
  }
}
