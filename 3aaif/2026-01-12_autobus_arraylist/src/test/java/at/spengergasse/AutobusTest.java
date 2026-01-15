package at.spengergasse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class AutobusTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AutobusTest {
    static int busSize = 20;
    static int someSize = busSize / 2;
    Autobus bus;
    ArrayList<Person> persons;

    @BeforeEach
    public void setUp() {
        persons = new ArrayList<>();
        while (persons.size() < busSize) {
            persons.add(new Person());
        }
    }

    @Test // es wird geprüft, ob NULL einsteigen darf
    public void testEinsteigenThrowsOnNull() {
        assertThrows(RuntimeException.class, () -> {
            bus.einsteigen(null);
        });
    }

    //@Test // es wird geprüft, ob erkannt wird, wenn eine bereits drinnen Person einsteigen
    // soll.
    /*
    public void testEinsteigenThrowsOnAlreadyInside() {
        fillSome();
        assertThrows(RuntimeException.class, () -> {
            bus.einsteigen(persons[5]);
        });
    }

    @Test
    public void testEinsteigenBisVollSuccess() {
        for (int i = 0; i < busSize; i++) {
            assertTrue(bus.einsteigen(persons[i]));
        }
    }

    @Test
    public void testEinsteigenWhenFullFails() {
        fillFull();
        assertFalse(bus.einsteigen(persons[busSize]));
    }

    @Test
    public void testPersonInside() {
        fillSome();
        for (int i = 0; i < someSize; i++) {
            assertTrue(bus.istDrin(persons[i]));
        }
        for (int i = someSize; i < busSize; i++) {
            assertFalse(bus.istDrin(persons[i]));
        }
    }

    @AfterEach
    public void tearDown() {
    }

    private void fillSome() {
        for (int i = 0; i < someSize; i++) {
            bus.einsteigen(persons[i]);
        }
    }

    private void fillFull() {
        for (int i = 0; i < busSize; i++) {
            bus.einsteigen(persons[i]);
        }
    }
    */
    @Test
    void einsteigen() {
    }

    @Test
    void istDrin() {
    }

    @Test
    void istVoll() {
        Autobus bus1 = new Autobus(10);
        for (int i = 0; i < 9; i++) {
            assertTrue(bus1.einsteigen(persons.get(i)));
            assertFalse(bus1.istVoll());
        }
        // jetzt ist genau 1 Platz frei
        assertTrue(bus1.einsteigen(new Person()));
        assertTrue(bus1.istVoll());
        assertFalse(bus1.hatPlatz());
        // er ist jetzt voll
        assertFalse(bus1.einsteigen(new Person()));
        assertTrue(bus1.istVoll());
        assertFalse(bus1.hatPlatz());
    }

    @Test
    void hatPlatz() {
    }

    @Test
    void testEinsteigenThrowsOldStyle() {
        Autobus bus = new Autobus(4);
        // test ob throws
        try {
            bus.einsteigen(null);
            fail(); // exception erzwingen
        } catch (IllegalArgumentException _) {}
    }
    @Test
    void testEinsteigenThrowsModern() {
        Autobus bus = new Autobus(4);
        assertThrows(IllegalArgumentException.class, () -> bus.einsteigen(null));

    }
}