package problem_1.exception;

public class ImpossibleLengthException extends RuntimeException {
  public ImpossibleLengthException() {
    super("Error: Length or Breadth should be in valid range.");
  }
}
