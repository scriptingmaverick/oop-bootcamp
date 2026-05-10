package problem_5.rules;

public class BlueBallLimitException extends RuntimeException {
  public BlueBallLimitException() {
    super("Error: Blue Balls should not exceed capacity of bag.");
  }
}
