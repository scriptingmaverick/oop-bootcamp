package problem_2.model;

import java.util.Objects;

public class Probability {
  private final double percentage;

  private Probability(double percentage) {
    this.percentage = percentage;
  }

  public static Probability create(double percentage) {
    return new Probability(percentage);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Probability that = (Probability) o;
    return Double.compare(percentage, that.percentage) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(percentage);
  }
}
