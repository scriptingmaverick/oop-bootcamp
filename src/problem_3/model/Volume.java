package problem_3.model;

public class Volume {
  private final double volume;
  private final VolumeUnit volumeUnit;

  private Volume(double volume, VolumeUnit volumeUnit) {
    this.volume = volume;
    this.volumeUnit = volumeUnit;
  }

  public static Volume create(double volume, VolumeUnit volumeUnit) {
    return new Volume(volume, volumeUnit);
  }

  private static double normalize(Volume obj) {
    return obj.volumeUnit.normalize(obj.volume);
  }

  public boolean compare(Volume othervolume) {
    return normalize(this) == normalize(othervolume);
  }
}
