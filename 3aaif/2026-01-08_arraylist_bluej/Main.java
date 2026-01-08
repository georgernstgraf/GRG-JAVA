

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList();
        liste.add("Hallo");
        liste.add("Welt");
        liste.add("pi ist etwa 3.14");
        liste.trimToSize();
        return;
    }
}
