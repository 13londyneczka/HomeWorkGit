package Lesson4.Exercise2;

public class Triangle extends Shape {

    private double baseLength;
    private double height;
    private double sideALength;
    private double sideBLength;

    public Triangle(double baseLength, double height, double sideALength, double sideBLength) {
        this.baseLength = baseLength;
        this.height = height;
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
    }

    @Override
    public double getArea() {
        return (baseLength * height)/2;
    }

    @Override
    public double getPerimeter() {
        return baseLength + sideBLength + sideALength;
    }
}
