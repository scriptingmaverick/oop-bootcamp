package problem_3.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

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

  @Test
  void shouldCompareAndReturnTrueFor1CmAnd10MM() {
    Length oneCm = Length.create(1, LengthUnit.CM);
    Length temMm = Length.create(10, LengthUnit.MM);

    assert (oneCm.compare(temMm));
  }

  @Test
  void shouldCompareAndReturnFalseFor2CmAnd10MM() {
    Length oneCm = Length.create(2, LengthUnit.CM);
    Length temMm = Length.create(10, LengthUnit.MM);

    assertFalse(oneCm.compare(temMm));
  }
}