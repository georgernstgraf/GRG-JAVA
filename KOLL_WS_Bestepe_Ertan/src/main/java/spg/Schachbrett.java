package spg;

public class Schachbrett {
    public static void zeichne(int kante) {
        System.out.println(String.format("Schachbrett mit Kantenlänge %s:", kante));
        // TODO zeichnen
    }

    public static void main(String[] args) {
        zeichne(5);
        zeichne(8);
        zeichne(11);
    }
}
