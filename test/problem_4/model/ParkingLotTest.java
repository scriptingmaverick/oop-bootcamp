package problem_4.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class ParkingLotTest {

  @Test
  void shouldParkACar() {
    ParkingLot parkingLot = ParkingLot.create(5);

    assert (parkingLot.park(new Vehicle()));
  }

  @Test
  void shouldNotParkACar() {
    ParkingLot parkingLot = ParkingLot.create(1);

    assert (parkingLot.park(new Vehicle()));
    assertFalse(parkingLot.park(new Vehicle()));
  }
}