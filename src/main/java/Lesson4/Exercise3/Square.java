package Lesson4.Exercise3;

public class Square implements AreaAndPerimeter {

  private final int sideA;

  public Square(int sideA) {
    this.sideA = sideA;
  }

  @Override
  public double getArea() {
    return sideA * sideA;
  }

  @Override
  public double getPerimeter() {
    return 4 * sideA;
  }
}
