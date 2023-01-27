package Lesson5.Exercise1;

import java.util.Scanner;

public class Text {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dzień dobry. W czym mogę pomóc?");
        String text = scanner.nextLine();

        if (text.length() == 0) {
            System.out.println("Pusty");
        } else {
            int length = text.length();
            System.out.println("Długość tekstu: " + length);

            boolean isPalindrome = true;
            for (int i = 0; i < length / 2; i++) {
                if (text.charAt(i) != text.charAt(length - i -1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Tekst jest palindromem");
            } else {
                System.out.println("Tekst nie jest palindromem");
            }
        }
    }
}
