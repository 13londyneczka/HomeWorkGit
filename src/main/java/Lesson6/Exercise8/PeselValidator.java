package Lesson6.Exercise8;

public class PeselValidator {

    public static void validationOfThePeselNumber(String pesel) {
        try {
            Long.parseLong(pesel);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("dozwolone tylko wartości liczbowe");
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException("nieprawidłowa ilość znaków");
        }

    }
}
