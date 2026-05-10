package problem_5.rules;

import problem_5.model.Ball;
import problem_5.model.Balls;
import problem_5.model.Colors;

public class BlueBallRule implements Rule {
  @Override
  public void check(Balls balls, Ball currentBall) {
    if (!currentBall.isOfColor(Colors.BLUE)) return;

    int ballsInBag = getBallsInBag(balls);

    if (balls.isWithin(ballsInBag, 1)) return;

    throw new BlueBallLimitException();
  }
}
