package problem_5.rules;

public class BagCapacityExceedException extends RuntimeException {
  public BagCapacityExceedException() {
    super("Error: Balls must not exceed the bag capacity.");
  }
}
