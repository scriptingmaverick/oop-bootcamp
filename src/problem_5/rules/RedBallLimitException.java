package problem_5.rules;

public class RedBallLimitException extends RuntimeException {
  public RedBallLimitException() {
    super("Error: Red Balls should not exceed twice of green balls in the bag.");
  }
}
