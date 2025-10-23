/**
 *
 * Hier ist die fehlende Logik zu implementieren!
 *
 * Die Testklasse darf unter keinen Umständen modifiziert werden!
 *
 */
public class Array {

    // Der gesuchte "RV" (return-value) ist hier die Summe aller Zahlen in dem
    // übergebenen int Array
    public static int arraySum(int[] arr) {

        int rv = 0;
        for (int item: arr) rv+=item;
        // for ( int i = 0 ; i < arr.length ; i++ ) {
        // rv += arr[i];
        // }
        return rv;
    }

    // hier wird das größte Element des Arrays gesucht
    public static int arrayMax(int[] arr) {
        int rv = Integer.MIN_VALUE;
        // Hier alles maximal ausgeschrieben
        for (int item: arr) {
            if (rv < item) {
                rv = item;
            }
        }
        return rv;
    }

    // hier wird das kleinste Element des Arrays gesucht
    public static int arrayMin(int[] arr) {
        int rv = Integer.MAX_VALUE;
        // hier: super kurz
        for (int item: arr) if (rv > item) rv = item;
        return rv;
    }

    // gib ein neues Array zurück, aber in der umgedrehten Reihenfolge!
    public static int[] toReversed(int[] arg) {
        int[] rv = new int[arg.length];
        int l = arg.length;
        for (int i = 0; i < l ; i++) {
            rv[l-i-1] = arg[i];
        }
        return rv;
    }

    // Das Array enthält positive und negative Zahlen
    // 1) retourniere diejenige Zahl des Arrays, welche am nächsten zu 0 ist. (mit
    // Test)
    // 2) für den Fall, dass eine positive und negative Zahl ex equo liegen, gib die
    // positive zurück
    public static int closestToZero(int[] arg) {
        return arg[0];
    }

}
