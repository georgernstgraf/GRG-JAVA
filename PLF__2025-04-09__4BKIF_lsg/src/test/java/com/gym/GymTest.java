package com.gym;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GymTest {
    private Gym gym;
    private ArrayList<Maschine> maschinen;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws GymException {
        gym = new Gym(5000.0, 10);
        maschinen = new ArrayList<>();
        maschinen.add(new Ergometer("A-Ergo", 2000.0f, 100));
        maschinen.add(new Ergometer("B-Ergo", 2000.0f, 100));
        maschinen.add(new Ergometer("C-Ergo", 2000.0f, 100));
        maschinen.add(new Beinpresse("A-BeinPresse", 3000.0f, 200));
        maschinen.add(new Beinpresse("B-BeinPresse", 3000.0f, 200));
        maschinen.add(new Beinpresse("C-BeinPresse", 3000.0f, 200));
    }

    private void fuellen() {
        maschinen.forEach((m) -> {
            try {
                gym.aufstellen(m);
            } catch (GymException ignored) {
            }
        });
    }

    @Test
    public void testAufstellen_sollFunktionieren_neuesErgometer_returnsTrue() throws GymException {
        Ergometer ergometer = new Ergometer("TestErgo", 2000.0f, 100);
        assertTrue(gym.aufstellen(ergometer));
    }

    @Test
    public void testAufstellen_sollNichtFunktionieren_null_returnsFalse() {
        try {
            gym.aufstellen(null);
            fail("Bei Null Argument muss Exepction geworfen werden!");
        } catch (GymException ignored) {
        }
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

    @org.junit.jupiter.api.Test
    void getMaxPreisEur() {
        assertEquals(5000.0, gym.getMaxPreisEur(), 0.0001, "Falscher MAXpreis");
    }

    @org.junit.jupiter.api.Test
    void getMaxAnzahl() {
        assertEquals(gym.getMaxAnzahl(), 10);
    }

    @org.junit.jupiter.api.Test
    void berechneAvgPreisMaschinen() {
        fuellen();
        assertEquals(2500.0, gym.berechneAvgPreisMaschinen(), 0.0001, "Falscher Durchschnittspreis");
    }

    @org.junit.jupiter.api.Test
    void sortierenNachName() {
        fuellen();
        gym.sortierenNachName();
        assertSame(gym.getMaschinen().getFirst(), maschinen.get(3));
        assertSame(gym.getMaschinen().getLast(), maschinen.get(2));
    }

    @org.junit.jupiter.api.Test
    void entfernenAlle() {
        fuellen();
        assertEquals(3, gym.entfernenAlle('B'));
        assertEquals(3, gym.getMaschinen().size());
        assertTrue(gym.getMaschinen().contains(maschinen.get(0)));
        assertTrue(gym.getMaschinen().contains(maschinen.get(1)));
        assertTrue(gym.getMaschinen().contains(maschinen.get(2)));
        assertEquals(3, gym.entfernenAlle('e')); ;
        assertEquals(0, gym.getMaschinen().size());
        assertEquals(-99, gym.entfernenAlle('x'));
    }

    @org.junit.jupiter.api.Test
    void entfernen() {
        fuellen();
        maschinen.forEach(m-> assertTrue(gym.entfernen(m)));
        maschinen.forEach(m-> assertFalse(gym.entfernen(m)));
        assertFalse(gym.entfernen(null));
    }

    @org.junit.jupiter.api.Test
    void maxWartungsIntervall() {
        fuellen();
        assertEquals(12, gym.maxWartungsIntervall());
    }

    @Test
    void getGroupedMachines() {
        fuellen();
        Map<String, List<Maschine>> groupedMachines = gym.getGroupedMachines();
        assertEquals(2, groupedMachines.size(), "Es gibt 2 Gruppen");
        assertTrue(groupedMachines.containsKey("Ergometer"), "Es gibt Ergometer");
        assertTrue(groupedMachines.containsKey("Beinpresse"), "Es gibt Beinpressen");
        assertEquals(3, groupedMachines.get("Ergometer").size(), "Es gibt 3 Ergometer");
        assertEquals(3, groupedMachines.get("Beinpresse").size(), "Es gibt 3 Beinpressen");
        assertTrue(groupedMachines.get("Ergometer").contains(maschinen.get(1)));
        assertTrue(groupedMachines.get("Beinpresse").contains(maschinen.get(3)));
        assertTrue(groupedMachines.get("Ergometer").contains(maschinen.get(2)));
        assertTrue(groupedMachines.get("Beinpresse").contains(maschinen.get(5)));

    }
}