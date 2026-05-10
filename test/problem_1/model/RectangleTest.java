package problem_1.model;

import org.junit.jupiter.api.Test;
import problem_1.exception.ImpossibleLengthException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {
  @Test
  void shouldCreateRectangleARectangle() {
    Rectangle rectangle = Rectangle.createRectangle(3, 4);

    assertEquals(rectangle, Rectangle.createRectangle(3, 4));
  }

  @Test
  void shouldCalculateArea() {
    Rectangle rectangle = Rectangle.createRectangle(3, 4);

    assert (12.0 == rectangle.calculateArea());
  }

  @Test
  void shouldCalculatePerimeter() {
    Rectangle rectangle = Rectangle.createRectangle(3, 4);

    assert (14.0 == rectangle.calculatePerimeter());
  }

  @Test
  void shouldCalculatePerimeterForDoubleValues() {
    Rectangle rectangle = Rectangle.createRectangle(3.8, 5.9);

    assert (19.4 == rectangle.calculatePerimeter());
  }

  @Test
  void shouldCalculateAreaForSquare() {
    Rectangle square = Rectangle.createSquare(3);

    assert (9 == square.calculateArea());
  }

  @Test
  void shouldCalculatePerimeterForSquare() {
    Rectangle square = Rectangle.createSquare(3.8);

    assert (14.44 == square.calculateArea());
  }

  @Test
  void shouldThrowErrorWhenCreatingRectangle() {
    assertThrows(ImpossibleLengthException.class, () -> Rectangle.createRectangle(-425, -4674));
  }

  @Test
  void shouldThrowErrorWhenCreatingSquare() {
    assertThrows(ImpossibleLengthException.class, () -> Rectangle.createSquare(-1));
  }
}