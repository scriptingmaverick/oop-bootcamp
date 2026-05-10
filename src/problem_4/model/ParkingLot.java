package problem_4.model;

import java.util.ArrayList;

public class ParkingLot {
  private final ArrayList<Vehicle> parkingSlots;
  private final int capacity;
  private final ParkingLotEventManager parkingLotEventManager;

  private ParkingLot(int size) {
    parkingSlots = new ArrayList<>(size);
    capacity = size;
    parkingLotEventManager = new ParkingLotEventManager();
  }

  public static ParkingLot create(int size) {
    return new ParkingLot(size);
  }

  public void park(Vehicle vehicle) {
    if (parkingSlots.size() == capacity) {
      return;
    }

    parkingSlots.add(vehicle);
    parkingLotEventManager.notify(ParkingEvents.PARKED);

    if (parkingSlots.size() <= (capacity * 0.2)) {
      parkingLotEventManager.notify(ParkingEvents.BELOW_TWENTY_PERCENT);
    }

    if (parkingSlots.size() >= (capacity * 0.8)) {
      parkingLotEventManager.notify(ParkingEvents.EIGHTY_PERCENT_FULL);
    }

    if (parkingSlots.size() == capacity) {
      parkingLotEventManager.notify(ParkingEvents.FULL);
    }
  }

  public void subscribe(ParkingEvents event, ParkingLotListener listener) {
    parkingLotEventManager.addEventListener(event, listener);
  }
}
