package problem_1.model;

import problem_1.exception.ImpossibleLengthException;

import java.util.Objects;

public class Rectangle {

  private final double breadth;
  private final double length;

  private Rectangle(double breadth, double length) {
    this.breadth = breadth;
    this.length = length;
  }

  private static Rectangle create(double breadth, double length) {
    if (breadth <= 0 || length <= 0) throw new ImpossibleLengthException();

    return new Rectangle(breadth, length);
  }

  public static Rectangle createRectangle(double breadth, double length) {
    return create(breadth, length);
  }

  public static Rectangle createSquare(double side) {
    return create(side, side);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Rectangle rectangle = (Rectangle) o;
    return breadth == rectangle.breadth && length == rectangle.length;
  }

  @Override
  public int hashCode() {
    return Objects.hash(breadth, length);
  }

  public double calculateArea() {
    return this.breadth * this.length;
  }

  public double calculatePerimeter() {
    return 2 * (breadth + length);
  }
}
