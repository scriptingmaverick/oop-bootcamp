package problem_2.model;

import java.util.Objects;

public class Probability {
  private final double probability;

  private Probability(double probability) {
    this.probability = probability;
  }

  public static Probability create(double percentage) {
    return new Probability(percentage);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Probability that = (Probability) o;
    return Double.compare(probability, that.probability) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(probability);
  }

  public Probability not() {
    return new Probability(1 - probability);
  }
}
