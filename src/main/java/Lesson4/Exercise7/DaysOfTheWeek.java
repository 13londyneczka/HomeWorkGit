package Lesson4.Exercise7;

public class DaysOfTheWeek {

    public static String getDayOfWeekName(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case Monday:
                return "Poniedziałek";
            case Tuesday:
                return "Wtorek";
            case Wednesday:
                return "Środa";
            case Thursday:
                return "Czwartek";
            case Friday:
                return "Piątek";
            case Saturday:
                return "Sobota";
            case Sunday:
                return "Niedziela";
            default:
                return "Nie ma takiego dnia tygodnia";
        }
    }
}
