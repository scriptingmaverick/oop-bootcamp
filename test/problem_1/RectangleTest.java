package problem_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
  @Test
  void shouldCreateARectangle() {
    Rectangle rectangle = Rectangle.create(3, 4);

    assertEquals(rectangle, Rectangle.create(3, 4));
  }
}