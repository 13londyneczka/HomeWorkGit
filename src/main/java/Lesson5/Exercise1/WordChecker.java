package Lesson5.Exercise1;

public class WordChecker {

  private static String word;

  public WordChecker(String word) {
    this.word = word;
  }

  public static boolean isEmpty(){
    return word.isEmpty();
  }

  public static int getLength(){
    return word.length();
  }

  public static boolean isPalindrome(){
    boolean isPalindrome = true;
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i -1)) {
        isPalindrome = false;
        break;
      }
    }
    return isPalindrome;
  }

  public static void wordCheck(){
    if(!isEmpty()){
      System.out.println(isPalindrome());
      System.out.println(getLength());
    }else{
      System.out.println("Text pusty");
    }
  }

}
