package at.spengergasse;

public class Arrays {
    static int[] koordinatenVonTrue(boolean[][][] matrix) {
        // Annahme es gib in dem ganzen Array einen einzigen Boolean Wert
        // und ich möchte die indizes wissen
        // z.B. matrix[132,721,43] = true
        return new int[]{132,721,43};
    }
    static int indexVonZahl (int gesucht, int[] array) {
        // Annahme: gesucht: 42
        // weiters : array: {8,9,3,42,7,11,0}
        // finde also 42
        return 3;
    }
}
