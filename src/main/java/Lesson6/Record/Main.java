package Lesson6.Record;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){
        File file = new File("D:\\data.txt");
        System.out.println(file.getName());
        System.out.println(file.canRead());
        System.out.println(file.exists());

        try {
            String text = Files.readString(Path.of("D:\\data.txt"));
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        writeToFile("D:\\newFile.txt", "abcd");

        parseTime("20:00");
    }

    public static void writeFile(String pathToFile, String  text){
        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))){
            writer.write(text);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Paths.get(pathToFile), text);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static void parseTime(String time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        try {
            simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


