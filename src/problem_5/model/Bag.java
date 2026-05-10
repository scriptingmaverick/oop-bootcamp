package problem_5.model;

import problem_5.rules.Rule;

public class Bag {
  private final int size;
  private final Balls balls;
  private final Rule rule;
  private int occupied;

  public Bag(int size, Rule rule) {
    this.size = size;
    balls = new Balls(size);
    occupied = 0;
    this.rule = rule;
  }

  public static Bag create(int size, Rule rule) {
    return new Bag(size, rule);
  }

  public void add(Ball ball) {
    rule.check(balls, ball);
    balls.add(ball);
    occupied++;
  }

  public int size() {
    return occupied;
  }
}
