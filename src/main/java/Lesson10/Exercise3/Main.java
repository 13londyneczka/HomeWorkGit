package Lesson10.Exercise3;

import static Lesson10.Exercise3.Url.isUrl;

public class Main {
  public static void main (String[] args) {
    isUrl("http://www.onet.pl");
    isUrl("https://mail.google.com");
    isUrl("http://wiadmosci.onet.pl");
    isUrl("http://onet.pl");
  }
}
