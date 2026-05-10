package problem_3.exception;

public class MeasurementMismatch extends RuntimeException {
  public MeasurementMismatch() {
    super("Error: Both measurements should be of same type.");
  }
}
