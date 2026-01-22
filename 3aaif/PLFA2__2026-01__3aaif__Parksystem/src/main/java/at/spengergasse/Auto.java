package at.spengergasse;

public class Auto {

    private String kennzeichen;

    public Auto() {
        setKennzeichen("noch nicht angemeldet");
    }

    public Auto(String kennzeichen) {
        setKennzeichen(kennzeichen);
    }
    public String getKennzeichen() {
        return this.kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        if (kennzeichen == null) {
            throw new IllegalArgumentException("darf nicht null sein.");
        }
        // wir wissen jetzt: ist nicht null
        if (kennzeichen.trim().isEmpty()) {
            throw new IllegalArgumentException("darf nicht null sein.");
        }
        this.kennzeichen = kennzeichen;
    }
}