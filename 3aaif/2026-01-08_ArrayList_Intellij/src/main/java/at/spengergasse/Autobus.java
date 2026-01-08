package at.spengergasse;/*
 * Dominic an i erinnern!!
 * 
 */

import java.util.ArrayList;

class Autobus {

    private ArrayList<Person> sitze;
    private int maxSitze;
/*
    In standard Java, the java.util.ArrayList does not have a built-in
    property to enforce a maximum size. It is designed to grow dynamically
    as long as the JVM has memory and the size does not exceed the theoretical
    limit of an integer (Integer.MAX_VALUE).
*/
    public Autobus(int sitze) {
        this.sitze = new Person[sitze];
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
        if (istDrin(person)) {
            throw new IllegalArgumentException("null sollte nie einsteigen");
        }
        for (int i = 0; i < sitze.length; i++ ) {
            /*  if (sitze[i] == null) { // also Sitz ist frei
            sitze[i] = person;
            return true;
            } */
            if (sitze[i] != null) continue;
            // sitze[i] ist sicher null wenn ich hier lande
            sitze[i] = person;
            return true;
        }
        return false;
    }

    // gibt zurück, ob die Person im Bus ist ( true / false )
    public boolean istDrin(Person person) {
        for (Person p: sitze) {
            if (p == person) {
                return true;
            }
        }
        return false;
    }

    public boolean hatPlatz() {
       return istDrin(null);
    }

    public boolean istVoll() {
        return !istDrin(null);
    }
}
