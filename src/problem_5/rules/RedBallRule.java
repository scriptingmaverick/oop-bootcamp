package problem_5.rules;

import problem_5.model.Ball;
import problem_5.model.Balls;
import problem_5.model.Colors;

public class RedBallRule implements Rule {

  @Override
  public void check(Balls balls, Ball currentBall) {
    if (!currentBall.isOfColor(Colors.RED)) return;

    int greenBalls = balls.filterBalls(Colors.GREEN);
    int redBallThreshold = greenBalls * 2;

    if (balls.filterBalls(Colors.RED) < redBallThreshold) return;

    throw new RedBallLimitException();
  }
}
