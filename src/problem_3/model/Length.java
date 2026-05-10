package problem_3.model;

import problem_3.exception.ImpossibleValueException;
import problem_3.exception.MeasurementMismatch;

public class Length extends Measurement<LengthUnit> implements Addable<Length> {
  private Length(double length, LengthUnit lengthUnit) {
    super(length, lengthUnit);
  }

  public static Length create(double length, LengthUnit unit) {
    if (length <= 0) throw new ImpossibleValueException("Error: Length should be valid.");

    return new Length(length, unit);
  }

  @Override
  public boolean compare(Measurement otherMeasurement) {
    if (!otherMeasurement.getClass().getName().equals(this.getClass().getName())) {
      throw new MeasurementMismatch();
    }

    return super.compare(otherMeasurement);
  }

  @Override
  public Length add(Length otherMeasurement) {
    double rawSum = normalize(this) + normalize(otherMeasurement);
    double sum = formatSum(rawSum);

    return create(sum, LengthUnit.INCH);
  }
}
