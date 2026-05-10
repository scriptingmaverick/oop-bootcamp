package problem_2.exception;

public class InvalidProbability extends RuntimeException {
  public InvalidProbability() {
    super("Error: Probability should be valid.");
  }
}
