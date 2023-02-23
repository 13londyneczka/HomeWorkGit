package Lesson4.Exercise3;

public class Rectangle implements AreaAndPerimeter {

  private final int sideA;
  private final int sideB;

  public Rectangle(int sideA, int sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public double getArea() {
    return sideA * sideB;
  }

  @Override
  public double getPerimeter() {
    return 2 * (sideA + sideB);
  }
}
