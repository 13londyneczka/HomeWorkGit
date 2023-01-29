package Lekcja4nagranie;

public class Developer extends Employee {

    public Developer(String name) {
        //super- wywolywanie konstruktora z klasy Employee
        super(name);
    }

    //over - nadpisaliśmy metodę tą
    @Override
    public String getDisplayName() {
        return getName();
    }
}
