package spg;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class BlumenladenTest {
    Blumenladen blumenladen;
    Produkt blume1;
    Produkt blume2;
    Produkt blume3;

    @BeforeEach
    void setUp() {
        blumenladen = new Blumenladen();
        blume1 = new Produkt("Rose", 3);
        blume2 = new Produkt("Tulpe", 4);
        blume3 = new Produkt("Sonnenblume", 5);
    }

    @org.junit.jupiter.api.Test
    void aufnehmen() {
        assertFalse(blumenladen.aufnehmen(null));
        assertTrue(blumenladen.aufnehmen(blume1));
        assertFalse(blumenladen.aufnehmen(blume1));
        assertTrue(blumenladen.aufnehmen(blume2));
        assertFalse(blumenladen.aufnehmen(blume2));
        assertFalse(blumenladen.aufnehmen(blume3));
    }

    @org.junit.jupiter.api.Test
    void verkaufen() {
        assertTrue(blumenladen.aufnehmen(blume1));
        assertTrue(blumenladen.verkaufen(blume1));  // Rose 3
        assertFalse(blumenladen.verkaufen(blume1));
        assertTrue(blumenladen.aufnehmen(blume2));
        assertTrue(blumenladen.verkaufen(blume2));  // Tulpe 4
        assertTrue(blumenladen.aufnehmen(blume3));
        assertTrue(blumenladen.verkaufen(blume3));  // Sonnenblume 5
        assertFalse(blumenladen.verkaufen(blume3));
        assertFalse(blumenladen.verkaufen(null));
        assertEquals(12, blumenladen.getGesamtEinnahmen());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertFalse(blumenladen.toString().isEmpty());
        blumenladen.toString();
        blumenladen.aufnehmen(blume1);
        blumenladen.aufnehmen(blume2);
        blumenladen.toString();
        blumenladen.print();
    }

}