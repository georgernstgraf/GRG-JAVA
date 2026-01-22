package at.spengergasse;

public class Parkhaus {

    private Auto[] parkplaetze;

    public Parkhaus(int kapazitaet) {
        if (kapazitaet < 1) {
            throw new IllegalArgumentException("macht mindestens keinen sinn.");
        }
        parkplaetze = new Auto[kapazitaet];
    }

    public Integer findeFreienPlatz() {
        for (int i = 0; i < parkplaetze.length;i++) {
            if (parkplaetze[i]==null) return i;
        }
        return null;
    }

    public boolean parkeAuto(String kennzeichen) {
        Auto zuParkendes;
        try {
            zuParkendes = new Auto(kennzeichen);
        } catch (IllegalArgumentException e) {
            return false;
        }
        for (int i = 0 ; i < parkplaetze.length; i++) {
            if (parkplaetze[i] != null) continue;
            parkplaetze[i] = zuParkendes;
            return true;
        }
        return false;
    }

    public Integer findeAuto(String kennzeichen) {
        if (kennzeichen == null ) throw new NullPointerException("oida");
        if (kennzeichen.trim().isEmpty()) throw new IllegalArgumentException("empty");
        for (int i = 0 ; i < parkplaetze.length; i++) {
            if (parkplaetze[i] == null) continue;
            if (parkplaetze[i].getKennzeichen().equals(kennzeichen)) {
                return i;
            }
        }
        return null;
    }

    public Auto verlasseParkplatz(String kennzeichen) {
        if (kennzeichen == null) {
            throw new NullPointerException("du spinnst");
        }
        if (kennzeichen.trim().isEmpty()) {
            throw new IllegalArgumentException("string war leer oder white");
        }
        Integer platz = findeAuto(kennzeichen);  // könnte null sein
        if (platz == null) return null;
        Auto verlassendes = parkplaetze[platz];
        this.parkplaetze[platz] = null;
        return verlassendes;
    }

    public double berechneAuslastung() {
        // formel: belegt/gesamt * 100;
        return 100.0*(parkplaetze.length-anzahlFreierPlaetze())/parkplaetze.length;
    }

    public int anzahlFreierPlaetze() {
        int freie = 0;
        for (int i = 0; i<parkplaetze.length; i++) {
            if (parkplaetze[i] == null) freie++;
        }
        return freie;
    }
}