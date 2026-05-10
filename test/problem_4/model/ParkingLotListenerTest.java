package problem_4.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

class ParkingLotListenerTest {

  @DisplayName("parking lot attendant functionalities: ")
  @Nested
  class AttendantResponsibilitiesTest {
    private ParkingLotListener attendant = mock(ParkingLotListener.class);
    private ParkingLot parkingLot;

    @BeforeEach
    void setup() {
      parkingLot = ParkingLot.create(5);
      parkingLot.subscribe(ParkingEvents.PARKED, attendant);
      parkingLot.subscribe(ParkingEvents.FULL, attendant);
    }

    @Test
    void shouldNotifiedWhenACarIsParked() {
      parkingLot.park(new Vehicle());

      verify(attendant).update("PARKED has happened.");
    }

    @Test
    void shouldNotifiedWhenLotIsFull() {
      parkingLot.park(new Vehicle());
      parkingLot.park(new Vehicle());
      parkingLot.park(new Vehicle());
      parkingLot.park(new Vehicle());
      parkingLot.park(new Vehicle());

      InOrder inOrder = inOrder(attendant);
      inOrder.verify(attendant, times(5)).update("PARKED has happened.");
      inOrder.verify(attendant).update("FULL has happened.");
    }

    @Test
    void shouldNotifiedFromMoreThan1Lots() {
      ParkingLot parkingLot2 = ParkingLot.create(2);
      parkingLot2.subscribe(ParkingEvents.PARKED, attendant);
      parkingLot2.subscribe(ParkingEvents.FULL, attendant);
      
      parkingLot.park(new Vehicle());
      parkingLot.park(new Vehicle());
      parkingLot2.park(new Vehicle());
      parkingLot2.park(new Vehicle());

      InOrder inOrder = inOrder(attendant);
      inOrder.verify(attendant, times(4)).update("PARKED has happened.");
      inOrder.verify(attendant).update("FULL has happened.");
    }
  }

  @DisplayName("parking lot manager functionalities: ")
  @Nested
  class ManagerResponsibilities {

  }
}