package problem_4.model;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLotEventManager {
  private final HashMap<ParkingEvents, ArrayList<ParkingLotListener>> events = new HashMap<>();

  public void addEventListener(ParkingEvents event, ParkingLotListener listener) {
    events.computeIfAbsent(event, key -> new ArrayList<>()).add(listener);
  }

  public void removeEventListener(ParkingEvents event, ParkingLotListener listener) {
    events.computeIfPresent(event, (key, list) -> {
      list.remove(listener);
      return list.isEmpty() ? null : list;
    });
  }

  public void notify(ParkingEvents event) {
    ArrayList<ParkingLotListener> parkingLotListeners = events.get(event);

    for (ParkingLotListener parkingLotListener : parkingLotListeners) {
      parkingLotListener.update(event + " has happened.");
    }
  }
}
