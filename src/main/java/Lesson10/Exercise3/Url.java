package Lesson10.Exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {
  public static boolean isUrl(String url) {
    Pattern pattern = Pattern.compile(
        "^(ht|f)tp(s?)\\:\\/\\/[0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*(:(0-9)*)*(\\/?)([a-zA-Z0-9\\-\\.\\?\\,\\'\\/\\\\\\+&amp;%\\$#_]*)?$");
    Matcher matcher = pattern.matcher(url);
    boolean matches = matcher.matches();
    return matches;
  }
}
