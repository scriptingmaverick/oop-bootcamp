package problem_3.model;

import org.junit.jupiter.api.Test;
import problem_3.exception.MeasurementMismatch;

import static org.junit.jupiter.api.Assertions.assertThrows;

class VolumeTest {

  @Test
  void shouldCompareTwoVolumes() {
    Volume three_78Litres = Volume.create(3.78, VolumeUnit.L);
    Volume oneGal = Volume.create(1, VolumeUnit.GAL);

    assert (three_78Litres.compare(oneGal));
  }

  @Test
  void shouldThrowErrorBecauseComparingVolumeWithLength() {
    Volume three_78Litres = Volume.create(3.78, VolumeUnit.L);
    Length three_78Cms = Length.create(3.78, LengthUnit.CM);

    assertThrows(MeasurementMismatch.class, () -> three_78Litres.compare(three_78Cms));
  }
  
  @Test
  void shouldAdd1GalAnd1LAndReturn4_78L() {
    Volume oneGal = Volume.create(1, VolumeUnit.GAL);
    Volume oneL = Volume.create(1, VolumeUnit.L);

    Volume result = oneGal.add(oneL);

    assert (result.compare(Volume.create(4.78, VolumeUnit.L)));
  }
}