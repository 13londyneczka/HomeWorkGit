package Lesson10.Exercise5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static boolean isPasswordGood(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?!.*?(?:23)).{7,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
