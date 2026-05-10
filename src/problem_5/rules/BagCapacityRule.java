package problem_5.rules;

import problem_5.model.Ball;
import problem_5.model.Balls;

public class BagCapacityRule implements Rule {
  @Override
  public void check(Balls balls, Ball currentBall) {
    int ballsInBag = getBallsInBag(balls);
    if (balls.isWithin(ballsInBag, 1)) return;

    throw new BagCapacityExceedException();
  }
}
