package problem_3.model;

import org.junit.jupiter.api.Test;

class VolumeTest {

  @Test
  void shouldCompareTwoVolumes() {
    Volume three_78Litres = Volume.create(3.78, VolumeUnit.L);
    Volume oneGal = Volume.create(1, VolumeUnit.GAL);

    assert (three_78Litres.compare(oneGal));
  }
}