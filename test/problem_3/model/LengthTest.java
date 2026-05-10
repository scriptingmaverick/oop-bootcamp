package problem_3.model;

import org.junit.jupiter.api.Test;

class LengthTest {
  @Test
  void shouldCompare2Lengths() {
    Length oneFeet = Length.create(1, LengthUnit.FEET);
    Length twelveInches = Length.create(12, LengthUnit.INCH);

    assert (oneFeet.compare(twelveInches));
  }
}