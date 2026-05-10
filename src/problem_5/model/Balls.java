package problem_5.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Balls {
  private final int capacity;
  private final HashMap<Colors, ArrayList<Ball>> balls = new HashMap<>();

  public Balls(int size) {
    this.capacity = size;
  }

  public void add(Ball ball) {
    for (Colors color : Colors.values()) {
      if (ball.isOfColor(color)) {
        balls.computeIfAbsent(color, key -> new ArrayList<>()).add(ball);
      }
    }
  }

  public int filterBalls(Colors color) {
    return balls.get(color) == null ? 0 : balls.get(color).size();
  }

  public boolean isWithin(int threshold, double multiplyingFactor) {
    return threshold < Math.ceil(this.capacity * multiplyingFactor);
  }
}
