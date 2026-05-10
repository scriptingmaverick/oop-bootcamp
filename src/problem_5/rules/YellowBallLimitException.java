package problem_5.rules;

public class YellowBallLimitException extends RuntimeException {
  public YellowBallLimitException() {
    super("Error: Yellow Balls should not exceed 3 balls a bag.");
  }
}
