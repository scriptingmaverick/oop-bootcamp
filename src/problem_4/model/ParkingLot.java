package problem_4.model;

import java.util.ArrayList;

public class ParkingLot {
  private final ArrayList<Vehicle> parkingSlots;
  private final int capacity;

  private ParkingLot(int size) {
    parkingSlots = new ArrayList<>(size);
    capacity = size;
  }

  public static ParkingLot create(int size) {
    return new ParkingLot(size);
  }

  public boolean park(Vehicle vehicle) {
    if (parkingSlots.size() == capacity) return false;

    parkingSlots.add(vehicle);
    return true;
  }
}
