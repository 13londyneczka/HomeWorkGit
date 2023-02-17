package Lesson6.Exercise5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReverseOrder {

    public static void main(String[] args) {
        printReversOrder("C:\\Users\\Marysia\\Desktop\\GitRepozytoria\\HomeWorkGit\\src\\main\\resources\\TextFile");
    }

        public static void printReversOrder(String pathName) {
            try {
                List<String> allLines = Files.readAllLines(Paths.get(pathName));
                printReversePart(allLines);

            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

        private static void printReversePart(List<String> allLines) {
            for (int i = allLines.size() -1; i >= 0; i--) {
                System.out.println(allLines.get(i));
            }
        }
    }