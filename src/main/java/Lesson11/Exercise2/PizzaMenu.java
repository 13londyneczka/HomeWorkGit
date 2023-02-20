package Lesson11.Exercise2;

import java.util.Arrays;
import java.util.List;


public class PizzaMenu {

  public static void main(String[] args) {

    List<Pizza> menu = Arrays.asList(
        new Pizza(true, Arrays.asList("mozzarella", "pieczarki", "pomidor", "papryka"), 300, "wegetariańska"),
        new Pizza(false, Arrays.asList("mozzarella", "Salami", "cebula"), 400, "salami"),
        new Pizza(false, Arrays.asList("mozzarella", "pieczarki", "seler"), 350, "pieczarkowa"),
        new Pizza(true, Arrays.asList("mozzarella", "pomidor", "papryka"), 250, "pomidorowa"),
        new Pizza(false, Arrays.asList("mozzarella", "salami", "cebula", "selen"), 450, "salami z selerem"),
        new Pizza(false, Arrays.asList("mozzarella", "pieczarki", "pomidor", "papryka", "seler"), 400, "pieczarkowa z selerem"),
        new Pizza(true, Arrays.asList("mozzarella", "pomidor", "papryka"), 200, "pomidorowa"),
        new Pizza(false, Arrays.asList("mozzarella", "salami", "“cebula", "seler"), 500, "salami z selerem"),
        new Pizza(false, Arrays.asList("mozzarella", "pieczarki", "pomidor", "papryka"), 350, "pieczarkowa"),
        new Pizza(true, Arrays.asList("mozzarella", "pomidor", "papryka"), 300, "pomidorowa")
    );


    menu.stream()
        .filter(Pizza::isVegetarian)
        .map(Pizza::getName)
        .forEach(System.out::println);

    menu.stream()
        .filter(pizza -> pizza.getIngredients().contains("seler"))
        .map(Pizza::getName)
        .forEach(System.out::println);

    if (menu.stream()
        .filter(pizza -> pizza.isVegetarian() && pizza.getIngredients().contains("pomidor") && pizza.getIngredients().contains("papryka"))
        .findAny()
        .isPresent()) {
      System.out.println("Istnieje co najmniej jedna pizza wegetariańska z pomidorem i papryką");
    } else {
      System.out.println("Nie istnieje pizza wegetariańska z pomidorem i papryką");
    }

    if (menu.stream().allMatch(pizza -> pizza.getIngredients().contains("mozzarella"))) {
      System.out.println("Wszystkie dania zawierają mozzarellę");
    } else {
      System.out.println("Nie wszystkie dania zawierają mozzarellę");
    }

    Pizza pizzaMax = menu.stream()
        .max()
        .orElse(null);
    System.out.println("Pizza o najwyższej kaloryczności:" + pizzaMax.getName());
  }
}



















