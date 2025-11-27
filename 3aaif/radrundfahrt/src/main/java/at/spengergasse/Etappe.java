package at.spengergasse;

import java.util.Locale;
import java.util.Objects;

public class Etappe {
    private int nummer;
    private float laenge;
    private String zielOrt;
    private String sieger;
    private int stunden;
    private int minuten;

    public Etappe(float laenge, String zielOrt) {
        setLaenge(laenge);
        setZielOrt(zielOrt);
    }

    public int getNummer() {
        return nummer;
    }

    void setNummer(int nummer) {
        if (nummer < 1) {
            throw new IllegalArgumentException("Nummer muss positiv sein");
        }
        this.nummer = nummer;
    }

    public float getLaenge() {
        return laenge;
    }

    public void setLaenge(float laenge) {
        if (laenge <= 0) {
            throw new IllegalArgumentException("Laenge muss positiv sein");
        }
        this.laenge = laenge;
    }

    public String getZielOrt() {
        return zielOrt;
    }

    public void setZielOrt(String zielOrt) {
        this.zielOrt = Objects.requireNonNull(zielOrt, "Ziel-Ort darf nicht null sein").trim();
        if (this.zielOrt.isEmpty()) {
            throw new IllegalArgumentException("Ziel-Ort darf nicht leer sein");
        }
    }

    public String getSieger() {
        return sieger;
    }

    public void setSieger(String sieger) {
        this.sieger = Objects.requireNonNull(sieger, "Sieger darf nicht null sein").trim();
        if (this.sieger.isEmpty()) {
            throw new IllegalArgumentException("Sieger darf nicht leer sein");
        }
    }

    public int getStunden() {
        return stunden;
    }

    public void setStunden(int stunden) {
        if (stunden < 0) {
            throw new IllegalArgumentException("Stunden duerfen nicht negativ sein");
        }
        this.stunden = stunden;
    }

    public int getMinuten() {
        return minuten;
    }

    public void setMinuten(int minuten) {
        if (minuten < 0 || minuten >= 60) {
            throw new IllegalArgumentException("Minuten muessen zwischen 0 und 59 liegen");
        }
        this.minuten = minuten;
    }

    public int getGesamtdauerInMinuten() {
        return stunden * 60 + minuten;
    }

    private String formatiereDauer() {
        return String.format(Locale.US, "%d:%02d", stunden, minuten);
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "Laenge %.1f km, Ziel-Ort %s, Sieger %s, Dauer %s",
                laenge,
                zielOrt,
                sieger,
                formatiereDauer());
    }
}
