package problem_5.rules;

public class GreenBallLimitException extends RuntimeException {
  public GreenBallLimitException() {
    super("Error: Green Balls should not exceed 3 balls a bag.");
  }
}
