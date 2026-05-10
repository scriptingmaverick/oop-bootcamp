package problem_3.model;

import problem_3.exception.MeasurementMismatch;

public class Temperature extends Measurement<TemperatureUnit> {
  public Temperature(double degrees, TemperatureUnit unit) {
    super(degrees, unit);
  }

  public static Temperature create(double degrees, TemperatureUnit unit) {
    return new Temperature(degrees, unit);
  }

  @Override
  public boolean compare(Measurement otherMeasurement) {
    if (!otherMeasurement.getClass().getName().equals(this.getClass().getName())) {
      throw new MeasurementMismatch();
    }

    return super.compare(otherMeasurement);
  }
}
