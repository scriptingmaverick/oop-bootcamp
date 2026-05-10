package problem_4.model;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

class ParkingLotEventManagerTest {

  @Test
  void shouldAddListenerAndNotifyOnEvent() {
    ParkingLotEventManager parkingLotEventManager = new ParkingLotEventManager();
    ParkingLotListener mockListener = mock(ParkingLotListener.class);

    parkingLotEventManager.addEventListener(ParkingEvents.FULL, mockListener);
    parkingLotEventManager.notify(ParkingEvents.FULL);

    verify(mockListener).update("FULL has happened.");
  }

  @Test
  void shouldNotifyWhenSubscribedToMultipleEventManagers() {
    ParkingLotEventManager parkingLot1EventManager = new ParkingLotEventManager();
    ParkingLotEventManager parkingLot2EventManager = new ParkingLotEventManager();
    ParkingLotListener mockListener = mock(ParkingLotListener.class);

    parkingLot1EventManager.addEventListener(ParkingEvents.FULL, mockListener);
    parkingLot1EventManager.notify(ParkingEvents.FULL);

    parkingLot2EventManager.addEventListener(ParkingEvents.FULL, mockListener);
    parkingLot2EventManager.notify(ParkingEvents.FULL);

    InOrder inOrder = inOrder(mockListener);
    inOrder.verify(mockListener, times(2)).update("FULL has happened.");
  }
}