package problem_3.model;

import problem_3.exception.ImpossibleValueException;
import problem_3.exception.MeasurementMismatch;

public class Volume extends Measurement<VolumeUnit> implements Addable<Volume> {

  private Volume(double volume, VolumeUnit volumeUnit) {
    super(volume, volumeUnit);
  }

  public static Volume create(double volume, VolumeUnit volumeUnit) {
    if (volume <= 0) throw new ImpossibleValueException("Error: Volume should be valid.");

    return new Volume(volume, volumeUnit);
  }

  @Override
  public boolean compare(Measurement otherMeasurement) {
    if (!otherMeasurement.getClass().getName().equals(this.getClass().getName())) {
      throw new MeasurementMismatch();
    }

    return super.compare(otherMeasurement);
  }

  public Volume add(Volume otherVolume) {
    double rawSum = normalize(this) + normalize(otherVolume);
    double sum = formatSum(rawSum);

    return create(sum, VolumeUnit.L);
  }
}
