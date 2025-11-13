
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    Person[] persons;

    public AutobusTest() {
        persons = new Person[busSize + 1];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(i);
        }
    }

    @BeforeEach
    public void setUp() {
        bus = new Autobus(busSize);
    }

    @Test // es wird geprüft, ob NULL einsteigen darf
    public void testEinsteigenThrowsOnNull() {
        assertThrows(RuntimeException.class, () -> {
            bus.einsteigen(null);
        });
    }

    @Test // es wird geprüft, ob erkannt wird, wenn eine bereits drinnen Person einsteigen
          // soll.
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
}
