package problem_5.model;

import org.junit.jupiter.api.Test;
import problem_5.rules.*;

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
  void shouldThrowWhenLimitReachedForRedBallsWhenGreenBallsAre1() {
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

  @Test
  void shouldThrowWhenYellowLimitExceedsTo40Percent() {
    Bag bag = Bag.create(12, new YellowBallRule());

    bag.add(new Ball(Colors.GREEN));
    bag.add(new Ball(Colors.RED));
    bag.add(new Ball(Colors.RED));

    for (int i = 0; i < 5; i++) {
      bag.add(new Ball(Colors.YELLOW));
    }

    assertThrows(YellowBallLimitException.class, () -> bag.add(new Ball(Colors.YELLOW)));
  }

  @Test
  void shouldThrowWhenBlueBallLimitReached() {
    Bag bag = Bag.create(12, new BlueBallRule());

    bag.add(new Ball(Colors.GREEN));
    bag.add(new Ball(Colors.RED));
    bag.add(new Ball(Colors.RED));

    for (int i = 0; i < 9; i++) {
      bag.add(new Ball(Colors.BLUE));
    }

    assertThrows(BlueBallLimitException.class, () -> bag.add(new Ball(Colors.BLUE)));
  }

  @Test
  void shouldThrowWhenBagCapacityLimitReached() {
    Bag bag = Bag.create(12, new BagCapacityRule());

    bag.add(new Ball(Colors.GREEN));
    bag.add(new Ball(Colors.RED));
    bag.add(new Ball(Colors.RED));

    for (int i = 0; i < 9; i++) {
      bag.add(new Ball(Colors.BLUE));
    }

    assertThrows(BagCapacityExceedException.class, () -> bag.add(new Ball(Colors.BLUE)));
  }
}