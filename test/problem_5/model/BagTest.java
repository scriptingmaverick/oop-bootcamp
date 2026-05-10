package problem_5.model;

import org.junit.jupiter.api.Test;

class BagTest {
  
  @Test
  void shouldStoreABall() {
    Bag bag = Bag.create(12);

    bag.add(new Ball(Colors.RED));
    assert (bag.size() == 1);
  }
}