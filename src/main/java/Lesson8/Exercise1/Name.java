package Lesson8.Exercise1;


import java.util.ArrayList;
import java.util.List;

public class Name {
  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Anna");
    names.add("Katarzyna");
    names.add("Tymon");
    names.add("Tadeusz");
    names.add("Anna");
    names.add("Karolina");
    names.add("Dorota");
    names.add("Piotr");

    List<String> uniqueNames = new ArrayList<>();
    for (String name : names) {
      if (!uniqueNames.contains(name)) {
        uniqueNames.add(name);
      }
    }
    System.out.println("Lista bez duplikatów: " + uniqueNames);

    List<String> reversNames = new ArrayList<>();
    for (int i = uniqueNames.size() -1; i>= 0; i--) {
      reversNames.add(uniqueNames.get(i));
    }
    System.out.println("Elementy w odwrotnej kolejnośći: " + reversNames);

    String changeFrom = "Anna";
    String changeTo = "Joanna";
    for (int i = 0; i < reversNames.size(); i++) {
      if (reversNames.get(i).equals(changeFrom)) {
        reversNames.set(i, changeTo);
      }
    }
    System.out.println("Elementy po zmianie: " + changeFrom + " -> " + changeTo + ":\n" + names);
  }
}
