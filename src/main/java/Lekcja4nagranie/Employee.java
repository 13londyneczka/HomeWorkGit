package Lekcja4nagranie;
//klasa nieistniejąca - wirtualna. Nie będziemy mogli tworzyć instancji tej klasy.
public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }
    //metoda
    public abstract String getDisplayName();

    public String getName(){
        return name;
    }
}


