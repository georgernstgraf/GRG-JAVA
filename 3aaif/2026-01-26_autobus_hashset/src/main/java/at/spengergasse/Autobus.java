package at.spengergasse;/*
 * Dominic an i erinnern!!
 * 
 */

import java.util.ArrayList;

class Autobus {

    private ArrayList<Person> sitze;
    private int maxsitze;

    public Autobus(int maxsitze) {
        this.sitze = new ArrayList<>();
        // eigentlich gehört hier ein setter:
        this.maxsitze = maxsitze;
    }

    // Anforderungen an die Methode:

    // 1) Exception werfen wenn
    // 1a) person is null
    // 2a) person ist bereits im Bus (caller über logikfehler informieren)

    // 2) die Person auf den ersten freien Sitz setzten und "true" zurückgeben
    // 3) wenn kein Platz mehr frei ist, nix machen und "false" zurückgeben
    public boolean einsteigen(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("null sollte nie einsteigen");
        }
        if (istVoll()) return false;
        if (istDrin(person)) {
            throw new IllegalStateException("ist schon drin");
            // return false;
        }
        if (sitze.size() >= maxsitze) {
            return false;
        }
        sitze.add(person);
        return true;
    }

    // gibt zurück, ob die Person im Bus ist ( true / false )
    public boolean istDrin(Person person) {
     return sitze.contains(person);
    }

    public boolean hatPlatz() {
       return !istVoll();
    }

    public boolean istVoll() {
        return sitze.size() >= maxsitze;
    }
}
