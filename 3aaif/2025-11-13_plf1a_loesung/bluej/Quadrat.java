public class Quadrat {
    public static void zeichne(int n) {
        for (int zeile = 0; zeile < n ; zeile++){
            for(int spalte = 0; spalte < n; spalte++){
                // erste / letzte Zeile
                if (zeile == 0 || zeile == n-1) {
                    System.out.print("# ");
                    continue;
                }
                if (zeile + spalte == n-1) {
                    System.out.print("§ ");
                    continue;
                }
                if (zeile == spalte) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
