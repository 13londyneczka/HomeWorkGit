package Lesson4.Exercise8;

import java.util.Objects;

public class Person {

    private final String name;
    private final String surname;
    private final int age;
    private final String placeOfBirth;

    public Person(String name, String surname, int age, String placeOfBirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return Objects.equals(name, p.name) &&
                Objects.equals(surname, p.surname) &&
                age == p.age &&
                Objects.equals(placeOfBirth, p.placeOfBirth);
    }

    @Override
    public int hashCode() {return Objects.hash(name, surname, age, placeOfBirth);
        }
    }
