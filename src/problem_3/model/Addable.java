package problem_3.model;

public interface Addable<T extends Measurement> {
  T add(T otherMeasurement);
}
