package problem_3.model;

public class Length {

  private final double length;
  private final LengthUnit lengthUnit;

  public Length(double length, LengthUnit lengthUnit) {
    this.length = length;
    this.lengthUnit = lengthUnit;
  }

  public static Length create(double length, LengthUnit lengthUnit) {
    return new Length(length, lengthUnit);
  }

  private static double normalize(Length obj) {
    return obj.lengthUnit.normalize(obj.length);
  }

  public boolean compare(Length otherLength) {
    return normalize(this) == normalize(otherLength);
  }
}
