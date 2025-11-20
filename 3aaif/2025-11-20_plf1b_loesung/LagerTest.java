import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class lagerTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LagerTest {
    static int lagerSize = 50;
    static int maxKg = 1000;
    static int someSize = lagerSize / 2;
    Lager lager;
    Artikel[] fullArray;
    private static int possibleCount = 14;

    public LagerTest() {
        fullArray = new Artikel[lagerSize + 1];
        for (int i = 0; i < fullArray.length; i++) {
            fullArray[i] = new Artikel(i * 10);
        }
    }

    @BeforeEach
    public void setUp() {
        lager = new Lager(lagerSize, maxKg);
    }

    @Test
    public void testFreieFaecherInitial() {
        assertEquals(lagerSize, lager.freieFaecher());
    }

    @Test
    public void testFreieFaecherMitLuecken() {
        lager.lager = getHoleArray(10);
        assertEquals(lagerSize - 10, lager.freieFaecher());
        lager.lager = getHoleArray(20);
        assertEquals(lagerSize - 20, lager.freieFaecher());
    }

    @Test
    public void testBeladungInKg() {
        lager.lager = getHoleArray(5);
        assertEquals(100, lager.beladungInKg());
        lager.lager = getHoleArray(10);
        assertEquals(450, lager.beladungInKg());
    }

    @Test // es wird geprüft, ob NULL reingeben darf
    public void testReingebenThrowsOnNull() {
        assertThrows(RuntimeException.class, () -> {
            lager.reingeben(null);
        });
    }

    @Test // es wird geprüft, ob erkannt wird, wenn eine bereits drinnen Artikel reingeben
          // soll.
    public void testReingebenThrowsOnAlreadyInside() {
        lager.lager = fullArray;
        assertThrows(RuntimeException.class, () -> {
            lager.reingeben(fullArray[5]);
        });
        assertThrows(RuntimeException.class, () -> {
            lager.reingeben(fullArray[fullArray.length / 2]);
        });
        assertThrows(RuntimeException.class, () -> {
            lager.reingeben(fullArray[fullArray.length / 3]);
        });
    }

    @Test
    public void testReingebenBisPlatzAus() {
        for (int i = 0; i < lagerSize; i++) {
            assertTrue(lager.reingeben(new Artikel(3)));
        }
        assertFalse(lager.reingeben(new Artikel(3)));
    }

    @Test
    public void testReingebenBisMaxGewicht() {
        for (int i = 0; i < possibleCount; i++) {
            assertTrue(lager.reingeben(fullArray[i]));
        }
        for (int i = possibleCount; i < lagerSize; i++) {
            assertFalse(lager.reingeben(fullArray[i]));
        }
    }

    @Test
    public void testArtikelInside() {
        fillSome();
        for (int i = 0; i < possibleCount; i++) {
            assertTrue(lager.istDrin(fullArray[i]));
        }
        for (int i = possibleCount; i < lagerSize; i++) {
            assertFalse(lager.istDrin(fullArray[i]));
        }
    }

    @AfterEach
    public void tearDown() {
    }

    private void fillSome() {
        for (int i = 0; i < possibleCount; i++) {
            lager.reingeben(fullArray[i]);
        }
    }

    private void fillFull() {
        for (int i = 0; i < lagerSize; i++) {
            lager.reingeben(fullArray[i]);
        }
    }

    private Artikel[] getHoleArray(int artikelCount) {
        Artikel[] rv = new Artikel[lager.lager.length];
        int index = 0;
        for (int counter = 0; counter < artikelCount; counter++) {
            rv[index] = fullArray[counter];
            index += 2;
        }
        return rv;
    }
}
