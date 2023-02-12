package Lesson5.Exercise2;

public class Game {

    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public static void game() {

        for (int i = 1; i <= 100; i++) {
            if (isDivisibleBy(i, 3)) {
                System.out.println("Fizz");
            } else if (isDivisibleBy(i, 5)) {
                System.out.println("Buzz");
            } else if (isDivisibleBy(i, 3) && isDivisibleBy(i, 5)) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
