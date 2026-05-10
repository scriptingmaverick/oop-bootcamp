package problem_5.rules;

import problem_5.model.Ball;
import problem_5.model.Balls;

public interface Rule {
  abstract void check(Balls balls, Ball currentBall);
}
