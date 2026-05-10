package problem_5.model;

public class Ball {
  private final Colors color;

  public Ball(Colors color) {
    this.color = color;
  }

  public boolean isOfColor(Colors color) {
    return this.color.equals(color);
  }
}
