import org.junit.jupiter.api.Test;

public class QuadratTest {
    @Test // es wird geprüft, ob NULL einsteigen darf
    public void testZeichne5() {
        Quadrat.zeichne(5);
    }

    @Test // es wird geprüft, ob NULL einsteigen darf
    public void testZeichne15() {
        Quadrat.zeichne(15);
    }

    @Test // es wird geprüft, ob NULL einsteigen darf
    public void testZeichne40() {
        Quadrat.zeichne(40);
    }
}
