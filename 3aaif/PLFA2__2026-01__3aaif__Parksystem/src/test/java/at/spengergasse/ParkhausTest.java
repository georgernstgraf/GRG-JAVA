package at.spengergasse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkhausTest {

    private Parkhaus parkhaus;
    private Parkhaus smallParkhaus;

    @BeforeEach
    void setUp() {
        parkhaus = new Parkhaus(10);
        smallParkhaus = new Parkhaus(3);
    }

    @Test
    @DisplayName("Constructor with valid kapazitaet should create parkhaus")
    void testConstructorValidKapazitaet() {
        assertDoesNotThrow(() -> new Parkhaus(1),
                "Constructor should accept kapazitaet >= 1");
        assertDoesNotThrow(() -> new Parkhaus(100),
                "Constructor should accept larger kapazitaet");
    }

    @Test
    @DisplayName("Constructor with kapazitaet 0 should throw IllegalArgumentException")
    void testConstructorKapazitaetZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Parkhaus(0),
                "Constructor should throw for kapazitaet 0"
        );
        assertTrue(exception.getMessage().toLowerCase().contains("kapazitaet") ||
                exception.getMessage().toLowerCase().contains("mindestens"),
                "Exception message should mention kapazitaet or mindestens");
    }

    @Test
    @DisplayName("Constructor with negative kapazitaet should throw IllegalArgumentException")
    void testConstructorNegativeKapazitaet() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Parkhaus(-1),
                "Constructor should throw for negative kapazitaet"
        );
        assertTrue(exception.getMessage().toLowerCase().contains("kapazitaet") ||
                exception.getMessage().toLowerCase().contains("mindestens"),
                "Exception message should mention kapazitaet or mindestens");
    }

    @Test
    @DisplayName("findeFreienPlatz should return 0 for empty parkhaus")
    void testFindeFreienPlatzReturnsZero() {
        assertEquals(Integer.valueOf(0), parkhaus.findeFreienPlatz(),
                "First free space should be at index 0");
    }

    @Test
    @DisplayName("findeFreienPlatz after parking one car should return 1")
    void testFindeFreienPlatzAfterOneCar() {
        parkhaus.parkeAuto("W-12345");
        assertEquals(Integer.valueOf(1), parkhaus.findeFreienPlatz(),
                "Next free space should be at index 1");
    }

    @Test
    @DisplayName("findeFreienPlatz should find next available spot correctly")
    void testFindeFreienPlatzWithMultipleCars() {
        parkhaus.parkeAuto("W-11111");
        parkhaus.parkeAuto("W-22222");
        assertEquals(Integer.valueOf(2), parkhaus.findeFreienPlatz());
    }

    @Test
    @DisplayName("findeFreienPlatz on full parkhaus should return null")
    void testFindeFreienPlatzFull() {
        smallParkhaus.parkeAuto("W-11111");
        smallParkhaus.parkeAuto("W-22222");
        smallParkhaus.parkeAuto("W-33333");
        assertNull(smallParkhaus.findeFreienPlatz(),
                "findeFreienPlatz should return null when parkhaus is full");
    }

    @Test
    @DisplayName("parkeAuto with valid kennzeichen should succeed")
    void testParkeAutoValid() {
        assertTrue(parkhaus.parkeAuto("W-12345"),
                "parkeAuto should return true for valid kennzeichen");
    }

    @Test
    @DisplayName("parkeAuto should park at index 0 first")
    void testParkeAutoParksAtZero() {
        parkhaus.parkeAuto("W-11111");
        assertEquals(Integer.valueOf(0), parkhaus.findeAuto("W-11111"),
                "First car should be parked at index 0");
    }

    @Test
    @DisplayName("parkeAuto with null should return false")
    void testParkeAutoNull() {
        assertFalse(parkhaus.parkeAuto(null),
                "parkeAuto should return false for null kennzeichen");
    }

    @Test
    @DisplayName("parkeAuto with empty string should return false")
    void testParkeAutoEmpty() {
        assertFalse(parkhaus.parkeAuto(""),
                "parkeAuto should return false for empty string");
    }

    @Test
    @DisplayName("parkeAuto with whitespace should return false")
    void testParkeAutoWhitespace() {
        assertFalse(parkhaus.parkeAuto("   "),
                "parkeAuto should return false for whitespace only");
    }

    @Test
    @DisplayName("parkeAuto on full parkhaus should return false")
    void testParkeAutoFull() {
        smallParkhaus.parkeAuto("W-11111");
        smallParkhaus.parkeAuto("W-22222");
        smallParkhaus.parkeAuto("W-33333");
        assertFalse(smallParkhaus.parkeAuto("W-44444"),
                "parkeAuto should return false when parkhaus is full");
    }

    @Test
    @DisplayName("parkeAuto should park multiple cars sequentially")
    void testParkeAutoMultipleCars() {
        assertTrue(parkhaus.parkeAuto("W-11111"));
        assertTrue(parkhaus.parkeAuto("W-22222"));
        assertTrue(parkhaus.parkeAuto("W-33333"));
        assertEquals(7, parkhaus.anzahlFreierPlaetze(),
                "Should have 7 free spots after parking 3 cars");
    }

    @Test
    @DisplayName("findeAuto with existing kennzeichen should return correct index")
    void testFindeAutoExisting() {
        parkhaus.parkeAuto("W-12345");
        assertEquals(Integer.valueOf(0), parkhaus.findeAuto("W-12345"),
                "findeAuto should return index 0 for first car");
    }

    @Test
    @DisplayName("findeAuto with multiple cars should find correct indices")
    void testFindeAutoMultipleCars() {
        parkhaus.parkeAuto("W-11111");
        parkhaus.parkeAuto("W-22222");
        parkhaus.parkeAuto("W-33333");
        assertEquals(Integer.valueOf(0), parkhaus.findeAuto("W-11111"));
        assertEquals(Integer.valueOf(1), parkhaus.findeAuto("W-22222"));
        assertEquals(Integer.valueOf(2), parkhaus.findeAuto("W-33333"));
    }

    @Test
    @DisplayName("findeAuto with non-existing kennzeichen should return null")
    void testFindeAutoNotExisting() {
        parkhaus.parkeAuto("W-11111");
        assertNull(parkhaus.findeAuto("W-99999"),
                "findeAuto should return null for non-existing car");
    }

    @Test
    @DisplayName("findeAuto with null should throw NullPointerException")
    void testFindeAutoNull() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> parkhaus.findeAuto(null),
                "findeAuto should throw NullPointerException for null kennzeichen"
        );
        assertTrue(exception.getMessage() != null,
                "Exception should have a message");
    }

    @Test
    @DisplayName("findeAuto with empty string should throw IllegalArgumentException")
    void testFindeAutoEmpty() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> parkhaus.findeAuto(""),
                "findeAuto should throw IllegalArgumentException for empty string"
        );
        assertTrue(exception.getMessage() != null,
                "Exception should have a message");
    }

    @Test
    @DisplayName("findeAuto with whitespace should throw IllegalArgumentException")
    void testFindeAutoWhitespace() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> parkhaus.findeAuto("   "),
                "findeAuto should throw IllegalArgumentException for whitespace only"
        );
        assertTrue(exception.getMessage() != null,
                "Exception should have a message");
    }

    @Test
    @DisplayName("verlasseParkplatz with existing kennzeichen should return Auto")
    void testVerlasseParkplatzExisting() {
        parkhaus.parkeAuto("W-12345");
        Auto removed = parkhaus.verlasseParkplatz("W-12345");
        assertNotNull(removed,
                "verlasseParkplatz should return the removed Auto");
        assertEquals("W-12345", removed.getKennzeichen(),
                "Removed Auto should have correct kennzeichen");
    }

    @Test
    @DisplayName("verlasseParkplatz should free up the parking spot")
    void testVerlasseParkplatzFreesSpot() {
        parkhaus.parkeAuto("W-11111");
        parkhaus.parkeAuto("W-22222");
        parkhaus.verlasseParkplatz("W-11111");
        assertEquals(Integer.valueOf(0), parkhaus.findeFreienPlatz(),
                "Spot 0 should be free after removal");
    }

    @Test
    @DisplayName("verlasseParkplatz with non-existing kennzeichen should return null")
    void testVerlasseParkplatzNotExisting() {
        parkhaus.parkeAuto("W-11111");
        Auto removed = parkhaus.verlasseParkplatz("W-99999");
        assertNull(removed,
                "verlasseParkplatz should return null for non-existing car");
    }

    @Test
    @DisplayName("verlasseParkplatz with null should throw NullPointerException")
    void testVerlasseParkplatzNull() {
        parkhaus.parkeAuto("W-11111");
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> parkhaus.verlasseParkplatz(null),
                "verlasseParkplatz should throw NullPointerException for null kennzeichen"
        );
        assertTrue(exception.getMessage() != null,
                "Exception should have a message");
    }

    @Test
    @DisplayName("verlasseParkplatz with empty string should throw IllegalArgumentException")
    void testVerlasseParkplatzEmpty() {
        parkhaus.parkeAuto("W-11111");
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> parkhaus.verlasseParkplatz(""),
                "verlasseParkplatz should throw IllegalArgumentException for empty string"
        );
        assertTrue(exception.getMessage() != null,
                "Exception should have a message");
    }

    @Test
    @DisplayName("verlasseParkplatz with whitespace should throw IllegalArgumentException")
    void testVerlasseParkplatzWhitespace() {
        parkhaus.parkeAuto("W-11111");
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> parkhaus.verlasseParkplatz("   "),
                "verlasseParkplatz should throw IllegalArgumentException for whitespace only"
        );
        assertTrue(exception.getMessage() != null,
                "Exception should have a message");
    }

    @Test
    @DisplayName("verlasseParkplatz on empty parkhaus should return null")
    void testVerlasseParkplatzEmptyParkhaus() {
        Auto removed = parkhaus.verlasseParkplatz("W-12345");
        assertNull(removed,
                "verlasseParkplatz should return null on empty parkhaus");
    }

    @Test
    @DisplayName("berechneAuslastung on empty parkhaus should return 0.0")
    void testBerechneAuslastungEmpty() {
        assertEquals(0.0, parkhaus.berechneAuslastung(), 0.001,
                "Auslastung should be 0.0 for empty parkhaus");
    }

    @Test
    @DisplayName("berechneAuslastung with one car should return 10% for kapazitaet 10")
    void testBerechneAuslastungOneCar() {
        parkhaus.parkeAuto("W-11111");
        assertEquals(10.0, parkhaus.berechneAuslastung(), 0.001,
                "Auslastung should be 10.0 for 1 car in 10 spots");
    }

    @Test
    @DisplayName("berechneAuslastung with 50% capacity should return 50.0")
    void testBerechneAuslastungHalfFull() {
        smallParkhaus.parkeAuto("W-11111");
        smallParkhaus.parkeAuto("W-22222");
        assertEquals(66.67, smallParkhaus.berechneAuslastung(), 0.01,
                "Auslastung should be 66.67 for 2 cars in 3 spots");
    }

    @Test
    @DisplayName("berechneAuslastung on full parkhaus should return 100.0")
    void testBerechneAuslastungFull() {
        smallParkhaus.parkeAuto("W-11111");
        smallParkhaus.parkeAuto("W-22222");
        smallParkhaus.parkeAuto("W-33333");
        assertEquals(100.0, smallParkhaus.berechneAuslastung(), 0.001,
                "Auslastung should be 100.0 for full parkhaus");
    }

    @Test
    @DisplayName("berechneAuslastung should update correctly after leaving")
    void testBerechneAuslastungAfterLeaving() {
        parkhaus.parkeAuto("W-11111");
        parkhaus.parkeAuto("W-22222");
        parkhaus.verlasseParkplatz("W-11111");
        assertEquals(10.0, parkhaus.berechneAuslastung(), 0.001,
                "Auslastung should update after car leaves");
    }

    @Test
    @DisplayName("anzahlFreierPlaetze on empty parkhaus should return kapazitaet")
    void testAnzahlFreierPlaetzeEmpty() {
        assertEquals(10, parkhaus.anzahlFreierPlaetze(),
                "Should have all spots free on empty parkhaus");
    }

    @Test
    @DisplayName("anzahlFreierPlaetze after parking should decrease correctly")
    void testAnzahlFreierPlaetzeAfterParking() {
        parkhaus.parkeAuto("W-11111");
        assertEquals(9, parkhaus.anzahlFreierPlaetze(),
                "Free spots should decrease by 1 after parking");
        parkhaus.parkeAuto("W-22222");
        assertEquals(8, parkhaus.anzahlFreierPlaetze(),
                "Free spots should continue decreasing");
    }

    @Test
    @DisplayName("anzahlFreierPlaetze on full parkhaus should return 0")
    void testAnzahlFreierPlaetzeFull() {
        smallParkhaus.parkeAuto("W-11111");
        smallParkhaus.parkeAuto("W-22222");
        smallParkhaus.parkeAuto("W-33333");
        assertEquals(0, smallParkhaus.anzahlFreierPlaetze(),
                "Should have 0 free spots on full parkhaus");
    }

    @Test
    @DisplayName("anzahlFreierPlaetze should increase correctly after leaving")
    void testAnzahlFreierPlaetzeAfterLeaving() {
        parkhaus.parkeAuto("W-11111");
        parkhaus.parkeAuto("W-22222");
        parkhaus.verlasseParkplatz("W-11111");
        assertEquals(9, parkhaus.anzahlFreierPlaetze(),
                "Free spots should increase after car leaves");
    }

    @Test
    @DisplayName("Complete workflow: park, find, leave, calculate")
    void testCompleteWorkflow() {
        assertTrue(parkhaus.parkeAuto("W-11111"));
        assertEquals(Integer.valueOf(0), parkhaus.findeAuto("W-11111"));
        assertEquals(10.0, parkhaus.berechneAuslastung(), 0.001);
        assertEquals(9, parkhaus.anzahlFreierPlaetze());

        Auto removed = parkhaus.verlasseParkplatz("W-11111");
        assertNotNull(removed);
        assertEquals("W-11111", removed.getKennzeichen());
        assertEquals(0.0, parkhaus.berechneAuslastung(), 0.001);
        assertEquals(10, parkhaus.anzahlFreierPlaetze());
    }

    @Test
    @DisplayName("Multiple cars with gaps after leaving")
    void testMultipleCarsWithGaps() {
        parkhaus.parkeAuto("W-11111");
        parkhaus.parkeAuto("W-22222");
        parkhaus.parkeAuto("W-33333");
        parkhaus.verlasseParkplatz("W-22222");

        assertEquals(Integer.valueOf(1), parkhaus.findeFreienPlatz(),
                "Should find spot 1 as next free");
        assertEquals(8, parkhaus.anzahlFreierPlaetze(),
                "Should have 8 free spots");
        assertEquals(20.0, parkhaus.berechneAuslastung(), 0.001,
                "Should have 20% auslastung");
    }

    @Test
    @DisplayName("Finding free spot after middle car leaves")
    void testFindingFreeSpotAfterMiddleLeaves() {
        smallParkhaus.parkeAuto("W-11111");
        smallParkhaus.parkeAuto("W-22222");
        smallParkhaus.parkeAuto("W-33333");
        smallParkhaus.verlasseParkplatz("W-22222");

        assertEquals(Integer.valueOf(1), smallParkhaus.findeFreienPlatz(),
                "Should find spot 1 as next free");
        assertTrue(smallParkhaus.parkeAuto("W-44444"),
                "Should be able to park in the freed spot");
        assertNull(smallParkhaus.findeFreienPlatz(),
                "Parkhaus should be full after parking");
    }
}