import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProduktTest {
    public ProduktTest() {
    }

    @Test
    public void produktTest() {
        String expected = "Name: Korallenkaktus Rhipsalis, Preis: 6 Euro";
        Produkt produkt = new Produkt("Korallenkaktus Rhipsalis", 6);
        assertEquals(expected, produkt.toString());
    }

    @Test
    public void produktTest2() {
        boolean wurdeGeworfen = false;
        try {
            Produkt prod = new Produkt(null,7);
        } catch (Exception e) {
            wurdeGeworfen = true;
        }
        assertTrue(wurdeGeworfen);
        assertEquals(true, wurdeGeworfen);
    }

    @Test
    public void produktTest3() {
        boolean wurdeGeworfen = false;
        try {
            Produkt prod = new Produkt("Kaktus",-1);
        } catch (Exception e) {
            wurdeGeworfen = true;
        }
        assertTrue(wurdeGeworfen);
        assertEquals(true, wurdeGeworfen);
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }
}
