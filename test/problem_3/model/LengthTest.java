package problem_3.model;

import org.junit.jupiter.api.Test;

class LengthTest {
  @Test
  void shouldCompare2Lengths() {
    Length oneFeet = Length.create(1, LengthUnit.FEET);
    Length twelveInches = Length.create(12, LengthUnit.INCH);

    assert (oneFeet.compare(twelveInches));
  }

  @Test
  void shouldCompareAndReturnTrue() {
    Length fiveCms = Length.create(5, LengthUnit.CM);
    Length twoInches = Length.create(2, LengthUnit.INCH);

    assert (fiveCms.compare(twoInches));
  }
}