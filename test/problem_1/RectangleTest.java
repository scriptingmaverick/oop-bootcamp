package problem_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
  @Test
  void shouldCreateARectangle() {
    Rectangle rectangle = Rectangle.create(3, 4);

    assertEquals(rectangle, Rectangle.create(3, 4));
  }

  @Test
  void shouldCalculateArea() {
    Rectangle rectangle = Rectangle.create(3, 4);

    assert (12.0 == rectangle.calculateArea());
  }

  @Test
  void shouldCalculatePerimeter() {
    Rectangle rectangle = Rectangle.create(3, 4);

    assert (14.0 == rectangle.calculatePerimeter());
  }

  @Test
  void shouldCalculatePerimeterForDoubleValues() {
    Rectangle rectangle = Rectangle.create(3.8, 5.9);

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
}