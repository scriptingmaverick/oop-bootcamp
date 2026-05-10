package problem_5.rules;

import problem_5.model.Ball;
import problem_5.model.Balls;
import problem_5.model.Colors;

public interface Rule {
  default int getBallsInBag(Balls balls) {
    int ballsInBag = 0;
    for (Colors color : Colors.values()) {
      ballsInBag += balls.filterBalls(color);
    }
    return ballsInBag;
  }

  abstract void check(Balls balls, Ball currentBall);
}
