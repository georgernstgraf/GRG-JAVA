package at.spengergasse;

import static org.junit.jupiter.api.Assertions.*;

class EtappeTest {
    Etappe e = new Etappe(150.0f, "Wien");
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void setNummer() {
        e.setNummer(5);
        assertEquals(5, e.getNummer());
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            e.setNummer(0);
        });
        assertEquals("Nummer muss positiv sein", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void setLaenge() {
    }

    @org.junit.jupiter.api.Test
    void setZielOrt() {
    }

    @org.junit.jupiter.api.Test
    void setSieger() {
    }

    @org.junit.jupiter.api.Test
    void setStunden() {
    }

    @org.junit.jupiter.api.Test
    void setMinuten() {
    }
}