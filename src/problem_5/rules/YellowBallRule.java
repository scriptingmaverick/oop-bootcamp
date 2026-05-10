package problem_5.rules;

import problem_5.model.Ball;
import problem_5.model.Balls;
import problem_5.model.Colors;

public class YellowBallRule implements Rule {
  public void check(Balls balls, Ball currentBall) {
    if (!currentBall.isOfColor(Colors.YELLOW)) return;

    if (balls.isWithin(balls.filterBalls(Colors.YELLOW), 0.4)) return;

    throw new YellowBallLimitException();
  }
}
