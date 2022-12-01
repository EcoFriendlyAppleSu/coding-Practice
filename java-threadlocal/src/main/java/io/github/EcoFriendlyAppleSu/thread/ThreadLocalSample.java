package io.github.EcoFriendlyAppleSu.thread;

import java.util.Random;

// Entity
public class ThreadLocalSample {

  // ThreadLocal <Generic>
  // ThreadLocal is
  private final static ThreadLocal<Integer> local = new ThreadLocal<>();

  private static Random random;

  static {
    random = new Random();
  }

  public static Integer generateNumber() {
    int value = random.nextInt(45);
    local.set(value); // set value in local
    return value;
  }

  public static Integer get() {
    return local.get();
  }

  public static void remove() {
    local.remove();
  }
}
