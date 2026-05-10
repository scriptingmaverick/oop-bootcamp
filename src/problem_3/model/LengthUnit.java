package problem_3.model;

public enum LengthUnit implements Unit {
  MM(0.04),
  CM(0.4),
  FEET(12),
  INCH(1);

  private final double standardLength;

  LengthUnit(double standardLength) {
    this.standardLength = standardLength;
  }

  @Override
  public double normalize(double length) {
    return this.standardLength * length;
  }
}
