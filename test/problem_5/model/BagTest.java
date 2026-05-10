package problem_5.model;

import org.junit.jupiter.api.Test;
import problem_5.rules.GreenBallLimitException;
import problem_5.rules.GreenBallRule;
import problem_5.rules.RedBallLimitException;
import problem_5.rules.RedBallRule;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BagTest {

  @Test
  void shouldStoreABall() {
    Bag bag = Bag.create(12, new GreenBallRule());

    bag.add(new Ball(Colors.RED));
    assert (bag.size() == 1);
  }

  @Test
  void shouldThrowWhenLimitReachedForGreenBalls() {
    Bag bag = Bag.create(12, new GreenBallRule());

    bag.add(new Ball(Colors.GREEN));
    bag.add(new Ball(Colors.GREEN));
    bag.add(new Ball(Colors.GREEN));

    assertThrows(GreenBallLimitException.class, () -> bag.add(new Ball(Colors.GREEN)));
  }

  @Test
  void shouldThrowWhenLimitReachedForRedBallsWhenGreenBallsare1() {
    Bag bag = Bag.create(12, new RedBallRule());

    bag.add(new Ball(Colors.GREEN));
    bag.add(new Ball(Colors.RED));
    bag.add(new Ball(Colors.RED));

    assertThrows(RedBallLimitException.class, () -> bag.add(new Ball(Colors.RED)));
  }

  @Test
  void shouldThrowWhenLimitReachedForRedBallsWhenGreenBallsare2() {
    Bag bag = Bag.create(12, new RedBallRule());

    for (int i = 0; i < 2; i++) {
      bag.add(new Ball(Colors.GREEN));
      bag.add(new Ball(Colors.RED));
      bag.add(new Ball(Colors.RED));
    }

    assertThrows(RedBallLimitException.class, () -> bag.add(new Ball(Colors.RED)));
  }

  @Test
  void shouldThrowWhenLimitReachedForRedBallsWhenGreenBallsare3() {
    Bag bag = Bag.create(12, new RedBallRule());

    for (int i = 0; i < 3; i++) {
      bag.add(new Ball(Colors.GREEN));
      bag.add(new Ball(Colors.RED));
      bag.add(new Ball(Colors.RED));
    }

    assertThrows(RedBallLimitException.class, () -> bag.add(new Ball(Colors.RED)));
  }
}