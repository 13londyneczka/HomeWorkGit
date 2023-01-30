package Lesson6.Record;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
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
        try {
            parseTimeThrows("20:00");
        } catch (ParseException e) {
            e.printStackTrace();

        }
//        try {
//            throw new InsuranceNumberNotValidException("Nr polisy nie ważny", new Throwable());
//        } catch (InsuranceNumberNotValidException e) {
//            throw new RuntimeException(e);
//        }


//        Doctor doctor = null;
//        doctor.setName("Name");

        try {
            parseTimeLogAndThrow("20-00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public static void writeFile(String pathToFile, String text) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))) {
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
            System.out.println("err");
        } finally {
            System.out.println("Wykonałem zapis do pliku");
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

    public static void parseTimeThrows(String time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        simpleDateFormat.parse(time);

    }

    public static String readFirstLine(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        }finally {
            if(br != null){
                br.close();
            }
        }

    }

    public static String readFirstLineNew(String  path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
             return br.readLine();
             }
    }

    public static void parseTimeLogAndThrow(String time) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

        try {
            simpleDateFormat.parse(time);
        }catch (ParseException e){
            System.out.println(e);
            throw e;
        }
    }
}


