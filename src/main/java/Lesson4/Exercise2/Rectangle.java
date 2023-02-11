package Lesson4.Exercise2;

public class Rectangle extends Shape {

    final double sideALength;
    final double sideBLength;

    public Rectangle(double sideALength, double sideBLength) {
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
    }

    @Override
    public double getArea() {
        return sideALength * sideBLength;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideALength + 2 * sideBLength;
    }
}
