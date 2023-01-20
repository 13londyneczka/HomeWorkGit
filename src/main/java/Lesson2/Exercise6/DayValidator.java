package Lesson2.Exercise6;

public class DayValidator {
    public static String printDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Thusday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Weekend";
            case 7:
                return "Weekend";
            default:
                return "There is no such a day!";
        }

    }
}
