package problem_3.model;

import problem_3.exception.MeasurementMismatch;

public class Volume extends Measurement<VolumeUnit> {

  private Volume(double volume, VolumeUnit volumeUnit) {
    super(volume, volumeUnit);
  }

  public static Volume create(double volume, VolumeUnit volumeUnit) {
    return new Volume(volume, volumeUnit);
  }

  @Override
  public boolean compare(Measurement otherMeasurement) {
    if (!otherMeasurement.getClass().getName().equals(this.getClass().getName())) {
      throw new MeasurementMismatch();
    }

    return super.compare(otherMeasurement);
  }
}
