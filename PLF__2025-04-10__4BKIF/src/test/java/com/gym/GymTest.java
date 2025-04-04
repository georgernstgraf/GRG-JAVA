package com.gym;

import static org.junit.jupiter.api.Assertions.*;

/*
public class GymTest {
    private Gym gym;

    @Before
    public void setUp() throws GymException {
        gym = new Gym(5000.0, 10);
    }

    @Test
    public void testAufstellen_sollFunktionieren_neuesErgometer_returnsTrue() throws GymException {
        Ergometer ergometer = new Ergometer("TestErgo", 2000.0f, 100);
        assertTrue(gym.aufstellen(ergometer));
    }

    @Test
    public void testAufstellen_sollNichtFunktionieren_null_returnsFalse() throws GymException {
        assertFalse(gym.aufstellen(null));
    }

    @Test
    public void testEntfernenmaschine_sollFunktionieren_beinpresseNichtImGym_returnsFalse() throws GymException {
        Beinpresse beinpresse = new Beinpresse("TestPresse", 3000.0f, 200);
        assertFalse(gym.entfernen(beinpresse));
    }

    @Test
    public void testEntfernenMaschine_sollFunktionieren_beinpresseImGym_returnsTrue() throws GymException {
        Beinpresse beinpresse = new Beinpresse("TestPresse", 3000.0f, 200);
        gym.aufstellen(beinpresse);
        assertTrue(gym.entfernen(beinpresse));
    }
}
*/
class GymTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getMaxPreisEur() {
    }

    @org.junit.jupiter.api.Test
    void getMaxAnzahl() {
    }

    @org.junit.jupiter.api.Test
    void aufstellen() {
    }

    @org.junit.jupiter.api.Test
    void berechneAvgPreisMaschinen() {
    }

    @org.junit.jupiter.api.Test
    void sortierenNachName() {
    }

    @org.junit.jupiter.api.Test
    void entfernenAlle() {
    }

    @org.junit.jupiter.api.Test
    void entfernen() {
    }

    @org.junit.jupiter.api.Test
    void maxWartungsIntervall() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}