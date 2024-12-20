public class Blumenladen {
    private int gesamtEinnahmen = 0;
    private Produkt produkt1 = null;
    private Produkt produkt2 = null;

    public boolean aufnehmen(Produkt produkt) {
        if (produkt == null) {
            throw new IllegalArgumentException("darf nicht null sein");
        }
        // wenn ich hierherkomme, ist produkt != null
        if (this.produkt1 == null) {
            this.produkt1 = produkt;
            return true;
        }
        // wenn ich hier lande kann ich produkt2 probieren
        if (this.produkt2 == null) {
            this.produkt2 = produkt;
            return true;
        }
        // wenn ich hierherkomme war kein Platz
        System.out.println("Kein Platz im Laden!");
        return false; // TODO: implement
    }

    public boolean verkaufen(Produkt produkt) {
        if (produkt == null) {
            return false;
        }
        if (this.produkt1 == produkt) {
            this.gesamtEinnahmen += produkt.getPreis();
            this.produkt1 = null;
            return true;
        }
        // hier lande ich nur wenn produkt1 wars nicht
        if (this.produkt2 == produkt) {
            this.gesamtEinnahmen += produkt.getPreis();
            this.produkt2 = null;
            return true;
        }
        System.out.println("Produkt ist nicht im Laden: " + produkt.toString());
        return false; // TODO: implement
    }

    public String toString() {
        int anzahlProdukte = 0;
        if (this.produkt1 != null) anzahlProdukte++;
        if (this.produkt2 != null) anzahlProdukte++;
        String rv = String.format("Blumenladen, Gesamteinnahmen: %d (dzt. %d Produkte)", this.gesamtEinnahmen, anzahlProdukte);
        if (produkt1 != null) rv += "\n" + produkt1.toString();
        if (produkt2 != null) rv += "\n" + produkt2.toString();
        return rv;
    }

    public void print() {
        System.out.println(this);  // bzw. this.toString();
        return;
    }
}
