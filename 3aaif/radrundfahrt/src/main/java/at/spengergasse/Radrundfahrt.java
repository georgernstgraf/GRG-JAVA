package at.spengergasse;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Radrundfahrt {
    private static final int MAX_ETAPPEN = 50;

    private final String name;
    private final Etappe[] etappen;
    private int etappenAnzahl;

    public Radrundfahrt(String name) {
        this.name = Objects.requireNonNull(name, "Name darf nicht null sein").trim();
        if (this.name.isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer sein");
        }
        this.etappen = new Etappe[MAX_ETAPPEN];
    }

    public boolean hinzufuegen(Etappe etappe) {
        Objects.requireNonNull(etappe, "Etappe darf nicht null sein");
        if (etappenAnzahl >= MAX_ETAPPEN) {
            return false;
        }
        etappen[etappenAnzahl] = etappe;
        etappenAnzahl++;
        etappe.setNummer(etappenAnzahl);
        return true;
    }

    public String etappenUebersicht() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < etappenAnzahl; i++) {
            sb.append(String.format(Locale.US, "Etappe %d: %s%n", i + 1, etappen[i].toString()));
        }
        return sb.toString();
    }

    public float berechneGesamtlaenge() {
        float sum = 0;
        for (int i = 0; i < etappenAnzahl; i++) {
            sum += etappen[i].getLaenge();
        }
        return sum;
    }

    public float berechneDurchschnittslaenge() {
        if (etappenAnzahl == 0) {
            return 0;
        }
        return berechneGesamtlaenge() / etappenAnzahl;
    }

    public int anzahlGewonnen(String fahrer) {
        String target = Objects.requireNonNull(fahrer, "Fahrer darf nicht null sein").trim();
        if (target.isEmpty()) {
            throw new IllegalArgumentException("Fahrer darf nicht leer sein");
        }
        int count = 0;
        for (int i = 0; i < etappenAnzahl; i++) {
            if (target.equalsIgnoreCase(etappen[i].getSieger())) {
                count++;
            }
        }
        return count;
    }

    public Etappe sucheLaengsteEtappe() {
        if (etappenAnzahl == 0) {
            return null;
        }
        Etappe laengste = etappen[0];
        for (int i = 1; i < etappenAnzahl; i++) {
            if (etappen[i].getLaenge() > laengste.getLaenge()) {
                laengste = etappen[i];
            }
        }
        return laengste;
    }

    public boolean annullieren(int pos) {
        if (pos <= 0 || pos > etappenAnzahl) {
            return false;
        }
        int index = pos - 1;
        for (int i = index; i < etappenAnzahl - 1; i++) {
            etappen[i] = etappen[i + 1];
            etappen[i].setNummer(i + 1);
        }
        etappen[etappenAnzahl - 1] = null;
        etappenAnzahl--;
        return true;
    }

    public int berechneGesamtdauer() {
        int gesamtMinuten = 0;
        for (int i = 0; i < etappenAnzahl; i++) {
            gesamtMinuten += etappen[i].getGesamtdauerInMinuten();
        }
        int stunden = gesamtMinuten / 60;
        int restMinuten = gesamtMinuten % 60;
        if (restMinuten >= 31) {
            stunden++;
        }
        return stunden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(System.lineSeparator());
        sb.append("=======================").append(System.lineSeparator()).append(System.lineSeparator());
        sb.append(String.format(Locale.US, "Etappen: %d%n", etappenAnzahl));
        sb.append(String.format(Locale.US, "Gesamt-Laenge: %.1f Km%n", berechneGesamtlaenge()));
        sb.append(String.format(Locale.US, "Gesamt-Dauer: %d Std.%n", berechneGesamtdauer()));
        Etappe laengste = sucheLaengsteEtappe();
        if (laengste != null) {
            sb.append(String.format(Locale.US, "Laengste Etappe: Nr. %d mit %.0f Km%n", laengste.getNummer(), laengste.getLaenge()));
        } else {
            sb.append("Laengste Etappe: -\n");
        }
        sb.append(String.format(Locale.US, "Etappen-Durchschnitt: %.0f Km%n", berechneDurchschnittslaenge()));
        for (int i = 0; i < etappenAnzahl; i++) {
            sb.append(String.format(Locale.US, "Etappe %d: %s%n", i + 1, etappen[i].toString()));
        }
        return sb.toString();
    }

    public void print() {
        System.out.println(toString());
    }
}
