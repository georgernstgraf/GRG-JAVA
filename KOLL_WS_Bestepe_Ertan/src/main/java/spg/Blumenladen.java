package spg;

public class Blumenladen {
    private int gesamtEinnahmen = 0;
    private Produkt produkt1 = null;
    private Produkt produkt2 = null;

    public boolean aufnehmen(Produkt produkt) {
    // TODO
        return false;
    }

    public boolean verkaufen(Produkt produkt) {
    // TODO
        return false;
    }

    public String toString() {
        int anzahlProdukte = 0;
        String rv = String.format("Blumenladen, Gesamteinnahmen: %d (dzt. %d Produkte)", this.gesamtEinnahmen,
                anzahlProdukte);
        // Hier, wenn spg.Produkt vorhanden, sein toString() an rv anhängen
        return rv;
    }

    public void print() {
        System.out.println(this); // bzw. this.toString();
        return;
    }
}
