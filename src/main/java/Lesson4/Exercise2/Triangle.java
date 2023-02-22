package Lesson4.Exercise2;

public class Triangle extends Shape {

    private final double baseLength;
    private final double height;
    private final double sideALength;
    private final double sideBLength;

    public Triangle(double baseLength, double height, double sideALength, double sideBLength) {
        this.baseLength = baseLength;
        this.height = height;
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
    }

    @Override
    public double getArea() {
        return (baseLength * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return baseLength + sideBLength + sideALength;
    }
}
