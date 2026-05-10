package problem_3.model;

public class Volume extends Measurement<VolumeUnit> {

  private Volume(double volume, VolumeUnit volumeUnit) {
    super(volume, volumeUnit);
  }

  public static Volume create(double volume, VolumeUnit volumeUnit) {
    return new Volume(volume, volumeUnit);
  }
}
