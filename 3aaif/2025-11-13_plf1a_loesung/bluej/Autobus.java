class Autobus {

    private Person[] sitze;

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
        return false;
    }

    // gibt zurück, ob die Person im Bus ist ( true / false )
    // throws on NULL
    public boolean istDrin(Person person) {
        return false;
    }
}
