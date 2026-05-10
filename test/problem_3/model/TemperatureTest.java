package problem_3.model;

import org.junit.jupiter.api.Test;

class TemperatureTest {

  @Test
  void shouldCompareTemperatures() {
    Temperature two_12F = Temperature.create(212, TemperatureUnit.F);
    Temperature hundredC = Temperature.create(100, TemperatureUnit.C);

    assert (two_12F.compare(hundredC));
  }
}