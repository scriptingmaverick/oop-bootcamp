package problem_5.model;

import org.junit.jupiter.api.Test;
import problem_5.rules.GreenBallLimitException;
import problem_5.rules.GreenBallRule;

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
}