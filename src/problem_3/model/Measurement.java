package problem_3.model;

public class Measurement<T extends Unit> {
  private final double quantity;
  private final T unit;

  public Measurement(double quantity, T unit) {
    this.quantity = quantity;
    this.unit = unit;
  }

  protected static <T extends Unit> double normalize(Measurement<T> obj) {
    return obj.unit.normalize(obj.quantity);
  }

  protected static double formatSum(double rawSum) {
    return Math.round(rawSum * 100.0) / 100.0;
  }

  public boolean compare(Measurement<T> otherMeasurement) {
    return Measurement.normalize(this) == Measurement.normalize(otherMeasurement);
  }
}
