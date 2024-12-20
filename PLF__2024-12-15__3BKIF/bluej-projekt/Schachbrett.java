public class Schachbrett {
    public static void zeichne(int kante) {
        System.out.println(String.format("Schachbrett mit Kantenlänge %s:", kante));
        boolean gerade = (kante %2) == 0;
        boolean schwarz = true;
        for (int z = 0 ; z < kante; z++) {
            for (int s = 0; s < kante; s++) {
                if (schwarz) System.out.print("# ");
                else System.out.print(". ");
                schwarz = !schwarz;
            }
            System.out.println();
            if (gerade) schwarz = !schwarz;
        }
    }
}
