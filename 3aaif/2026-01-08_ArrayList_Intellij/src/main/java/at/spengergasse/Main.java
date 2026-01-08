package at.spengergasse;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList liste = new ArrayList();
        liste.add("Hallo");
        liste.add(5);
        liste.add(3.14);
    // Wieso funktioniert das?
        int a = 7;
        Integer b = a; // Autoboxing
        int c = b;     // Auto-Unboxing
        // a = null;      // Fehler: int kann keinen null-Wert speichern
        // b = null;    // Integer-Referenz kann null speichern
        Integer d = 12;
        Integer e = b * d; // wir haben nur boxen, aber beim rechnen wird automatisch unboxed
        System.out.println(e);
        return;
    }
}
