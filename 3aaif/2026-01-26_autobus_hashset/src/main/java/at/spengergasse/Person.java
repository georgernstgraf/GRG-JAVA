package at.spengergasse;

import java.util.Random;

public class Person {
    public  int id;
    private final Random rnd = new Random(4711);

    public Person(int id) {
        this.id = id;
    }

    public Person() {
        // Wir vergeben unsere ID selber
        this.id = rnd.nextInt(1,3001);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
