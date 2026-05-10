package problem_3.model;

public enum TemperatureUnit implements Unit {
  F {
    @Override
    public double normalize(double value) {
      return super.normalize(value);
    }
  }, C {
    @Override
    public double normalize(double value) {
      return (value * (9.0 / 5.0)) + 32;
    }
  };

  public double normalize(double value) {
    return value;
  }
}
