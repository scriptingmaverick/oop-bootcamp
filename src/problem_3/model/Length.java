package problem_3.model;

public class Length extends Measurement<LengthUnit> {
  private Length(double length, LengthUnit lengthUnit) {
    super(length, lengthUnit);
  }

  public static Length create(double length, LengthUnit unit) {
    return new Length(length, unit);
  }
}
