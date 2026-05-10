package problem_1;

import java.util.Objects;

public class Rectangle {

  private final int breadth;
  private final int length;

  private Rectangle(int breadth, int length) {
    this.breadth = breadth;
    this.length = length;
  }

  public static Rectangle create(int breadth, int length) {
    return new Rectangle(breadth, length);
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
