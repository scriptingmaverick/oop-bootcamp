package problem_5.rules;

import problem_5.model.Ball;
import problem_5.model.Balls;
import problem_5.model.Colors;

public class GreenBallRule implements Rule {
  public void check(Balls balls, Ball currentBall) {
    if (!currentBall.isOfColor(Colors.GREEN)) return;

    if (balls.filterBalls(Colors.GREEN) < 3) return;

    throw new GreenBallLimitException();
  }
}
