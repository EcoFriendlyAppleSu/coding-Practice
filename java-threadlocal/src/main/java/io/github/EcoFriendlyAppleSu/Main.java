package io.github.EcoFriendlyAppleSu;

import io.github.EcoFriendlyAppleSu.thread.LocalUserThread;

public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      LocalUserThread localUserThread = new LocalUserThread();
      localUserThread.run();
    }
  }
}
