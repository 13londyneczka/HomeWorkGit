package Lesson3.Exercise4;
//Stwórz klasę i zaimplementuj statyczną metodę pozwalającą na konwersję minut na sekundy. Napisz testy do tej metody.
public class Conversion {

    public static int convertingMinutesToSeconds(){

        int minutes = 2;
        int seconds = minutes*60;

        System.out.println(seconds);

    }

}
