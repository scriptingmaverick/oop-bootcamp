package problem_4.model;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ParkingLotEventManagerTest {

  @Test
  void shouldAddListenerAndNotifyOnEvent() {
    ParkingLotEventManager parkingLotEventManager = new ParkingLotEventManager();
    ParkingLotListener mockListener = mock(ParkingLotListener.class);

    parkingLotEventManager.addEventListener(ParkingEvents.FULL, mockListener);
    parkingLotEventManager.notify(ParkingEvents.FULL);

    verify(mockListener).update("FULL has happened.");
  }
}