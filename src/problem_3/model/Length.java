package problem_3.model;

import problem_3.exception.MeasurementMismatch;

public class Length extends Measurement<LengthUnit> {
  private Length(double length, LengthUnit lengthUnit) {
    super(length, lengthUnit);
  }

  public static Length create(double length, LengthUnit unit) {
    return new Length(length, unit);
  }

  @Override
  public boolean compare(Measurement otherMeasurement) {
    if (!otherMeasurement.getClass().getName().equals(this.getClass().getName())) {
      throw new MeasurementMismatch();
    }
    
    return super.compare(otherMeasurement);
  }
}
