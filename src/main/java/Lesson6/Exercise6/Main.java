package Lesson6.Exercise6;

import static Lesson6.Exercise6.FileReader.convertContentToUpperCase;
import static Lesson6.Exercise6.FileWriter.writeToFile;

public class Main {
  public static void main(String [] args){
    writeToFile("C:\\Users\\Marysia\\Desktop\\GitRepozytoria\\HomeWorkGit\\src\\main\\java\\Lesson6\\Exercise6\\Resources\\output.txt","C:\\Users\\Marysia\\Desktop\\GitRepozytoria\\HomeWorkGit\\src\\main\\java\\Lesson6\\Exercise6\\Resources\\data.txt");
    convertContentToUpperCase("C:\\Users\\Marysia\\Desktop\\GitRepozytoria\\HomeWorkGit\\src\\main\\java\\Lesson6\\Exercise6\\Resources\\data.txt","C:\\Users\\Marysia\\Desktop\\GitRepozytoria\\HomeWorkGit\\src\\main\\java\\Lesson6\\Exercise6\\Resources\\output.txt");
  }
}
