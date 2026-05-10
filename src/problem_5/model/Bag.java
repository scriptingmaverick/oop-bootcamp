package problem_5.model;

public class Bag {
  private final int size;
  private final Balls balls;
  private int occupied;

  public Bag(int size) {
    this.size = size;
    balls = new Balls(size);
    occupied = 0;
  }

  public static Bag create(int size) {
    return new Bag(size);
  }

  public void add(Ball ball) {
    balls.add(ball);
    occupied++;
  }

  public int size() {
    return occupied;
  }
}
