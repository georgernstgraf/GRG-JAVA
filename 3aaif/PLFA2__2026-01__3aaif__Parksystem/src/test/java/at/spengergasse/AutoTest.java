package at.spengergasse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    private Auto auto;

    @BeforeEach
    void setUp() {
        auto = new Auto();
    }

    @Test
    @DisplayName("Default constructor should set kennzeichen to 'noch nicht angemeldet'")
    void testDefaultConstructor() {
        assertEquals("noch nicht angemeldet", auto.getKennzeichen(),
                "Default kennzeichen should be 'noch nicht angemeldet'");
    }

    @Test
    @DisplayName("Parameterized constructor should set kennzeichen correctly")
    void testParameterizedConstructor() {
        Auto auto2 = new Auto("W-12345");
        assertEquals("W-12345", auto2.getKennzeichen(),
                "Kennzeichen should be set to provided value");
    }

    @Test
    @DisplayName("getKennzeichen should return the correct kennzeichen")
    void testGetKennzeichen() {
        auto.setKennzeichen("G-98765");
        assertEquals("G-98765", auto.getKennzeichen(),
                "getKennzeichen should return the set kennzeichen");
    }

    @Test
    @DisplayName("setKennzeichen with valid value should succeed")
    void testSetKennzeichenValid() {
        assertDoesNotThrow(() -> auto.setKennzeichen("W-12345"),
                "setKennzeichen should not throw for valid kennzeichen");
        assertEquals("W-12345", auto.getKennzeichen(),
                "Kennzeichen should be updated to new value");
    }

    @Test
    @DisplayName("setKennzeichen with null should throw IllegalArgumentException")
    void testSetKennzeichenNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> auto.setKennzeichen(null),
                "setKennzeichen should throw IllegalArgumentException for null"
        );
        assertTrue(exception.getMessage().toLowerCase().contains("null") ||
                exception.getMessage().toLowerCase().contains("leer") ||
                exception.getMessage().toLowerCase().contains("kennzeichen"),
                "Exception message should mention null, leer, or kennzeichen");
    }

    @Test
    @DisplayName("setKennzeichen with empty string should throw IllegalArgumentException")
    void testSetKennzeichenEmpty() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> auto.setKennzeichen(""),
                "setKennzeichen should throw IllegalArgumentException for empty string"
        );
        assertTrue(exception.getMessage().toLowerCase().contains("null") ||
                exception.getMessage().toLowerCase().contains("leer") ||
                exception.getMessage().toLowerCase().contains("kennzeichen"),
                "Exception message should mention null, leer, or kennzeichen");
    }

    @Test
    @DisplayName("setKennzeichen with whitespace only should throw IllegalArgumentException")
    void testSetKennzeichenWhitespace() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> auto.setKennzeichen("   "),
                "setKennzeichen should throw IllegalArgumentException for whitespace only"
        );
        assertTrue(exception.getMessage().toLowerCase().contains("null") ||
                exception.getMessage().toLowerCase().contains("leer") ||
                exception.getMessage().toLowerCase().contains("kennzeichen"),
                "Exception message should mention null, leer, or kennzeichen");
    }

    @Test
    @DisplayName("Multiple setKennzeichen calls should update value correctly")
    void testSetKennzeichenMultiple() {
        auto.setKennzeichen("W-11111");
        assertEquals("W-11111", auto.getKennzeichen());

        auto.setKennzeichen("G-22222");
        assertEquals("G-22222", auto.getKennzeichen());

        auto.setKennzeichen("S-33333");
        assertEquals("S-33333", auto.getKennzeichen());
    }

    @Test
    @DisplayName("Parameterized constructor with special characters in kennzeichen")
    void testParameterizedConstructorSpecialChars() {
        Auto auto2 = new Auto("W-ABC-123");
        assertEquals("W-ABC-123", auto2.getKennzeichen());
    }

    @Test
    @DisplayName("Parameterized constructor with numbers only kennzeichen")
    void testParameterizedConstructorNumbersOnly() {
        Auto auto2 = new Auto("12345");
        assertEquals("12345", auto2.getKennzeichen());
    }
}