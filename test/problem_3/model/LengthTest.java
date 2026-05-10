package problem_3.model;

import org.junit.jupiter.api.Test;
import problem_3.exception.MeasurementMismatch;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @Test
  void shouldThrowErrorBecauseComparingVolumeWithLength() {
    Volume three_78Litres = Volume.create(3.78, VolumeUnit.L);
    Length three_78Cms = Length.create(3.78, LengthUnit.CM);

    assertThrows(MeasurementMismatch.class, () -> three_78Cms.compare(three_78Litres));
  }

  @Test
  void shouldAddTwoLengthsAndReturnStandardLength() {
    Length twoInches = Length.create(2, LengthUnit.INCH);

    Length result = twoInches.add(twoInches);

    assert (result.compare(Length.create(4, LengthUnit.INCH)));
  }

  @Test
  void shouldAdd2InchesAnd2_5CmsAndReturn3Inches() {
    Length twoInches = Length.create(2, LengthUnit.INCH);
    Length two_5cms = Length.create(2.5, LengthUnit.CM);

    Length result = twoInches.add(two_5cms);

    assert (result.compare(Length.create(3, LengthUnit.INCH)));
  }
}