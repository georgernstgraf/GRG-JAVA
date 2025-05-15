package spg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProduktTest {

    @Test
    public void produktTestToString() {
        String expected = "Name: Korallenkaktus Rhipsalis, Preis: 6 Euro";
        Produkt produkt = new Produkt("Korallenkaktus Rhipsalis", 6);
        Assertions.assertEquals(expected, produkt.toString());
    }

    @Test
    public void produktTest2ConstrNotNull() {
        boolean wurdeGeworfen = false;
        try {
            Produkt prod = new Produkt(null, 7);
        } catch (Exception e) {
            wurdeGeworfen = true; 
        }
        Assertions.assertTrue(wurdeGeworfen);
        Assertions.assertEquals(true, wurdeGeworfen);
    }

    @Test
    public void produktTest3NotNull() {
        boolean wurdeGeworfen = false;
        try {
            Produkt prod = new Produkt("Kaktus", -1);
        } catch (Exception e) {
            wurdeGeworfen = true;
        }
        Assertions.assertTrue(wurdeGeworfen);
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }
}
