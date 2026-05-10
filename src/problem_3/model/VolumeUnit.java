package problem_3.model;

public enum VolumeUnit {
  L(1.0), GAL(3.78);

  private final double standardValue;

  VolumeUnit(double standardValue) {
    this.standardValue = standardValue;
  }

  public double normalize(int volume) {
    return this.standardValue * volume;
  }
}
