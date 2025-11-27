package at.spengergasse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Radrundfahrt glockner = new Radrundfahrt("Glockner");
        glockner.hinzufuegen(createEtappe(152.3f, "Zell am See", "Felix Gall", 4, 12));
        glockner.hinzufuegen(createEtappe(198.7f, "Grossglockner Hochalpenstrasse", "Primoz Roglic", 5, 3));
        glockner.hinzufuegen(createEtappe(134.5f, "Lienz", "Patrick Konrad", 3, 48));
        glockner.hinzufuegen(createEtappe(89.2f, "Heiligenblut", "Jonas Vingegaard", 2, 27));

        glockner.print();
    }

    private static Etappe createEtappe(float laenge, String zielOrt, String sieger, int stunden, int minuten) {
        Etappe etappe = new Etappe(laenge, zielOrt);
        etappe.setSieger(sieger);
        etappe.setStunden(stunden);
        etappe.setMinuten(minuten);
        return etappe;
    }
}
