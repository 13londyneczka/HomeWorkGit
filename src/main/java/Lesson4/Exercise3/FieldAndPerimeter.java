package Lesson4.Exercise3;

public interface FieldAndPerimeter {
  public final double sideA;
  public final double sideB;
  public final double sideC;


  public static int field(int sideA, int sideB, int sideC) {
    return sideA * sideB * sideC;
  }
  public static int perimeter(int sideA, int sideB, int sideC){
    return sideA + sideB + sideC;
  }
}


