package Lesson7.Exercise1;

public class CheckingTheNumber {

    public static boolean isEven (int value) { return value % 2 == 0;}

    public static int sumFfTheDigitsOfTheGivenNumber(int value) {
        int sum = 0;

        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }
}
