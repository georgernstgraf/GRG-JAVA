package at.spengergasse;

public class Matrix {
    private Integer[][] array;

    public Matrix(Integer[][] array) {
        this.array = array;
    }

    public int getRows() {
        return array.length;
    }

    public int getCols() {
        return array[0].length;
    }

    private Integer[][] getArray() {
        return array;
    }

    public Matrix getDistanzMatrix() {
        Integer[][] distanzArray = new Integer[getRows()][getCols()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                if (i == j) {
                    distanzArray[i][j] = 0;
                    continue;
                }
                if (array[i][j] != 0) {
                    distanzArray[i][j] = 1;
                    continue;
                }
                distanzArray[i][j] = null; // Unendliche Distanz
            }
        }
        for (int k = 2; k < getRows(); k++) {
            if (noInfinityIn(distanzArray)) break;
            updateDistanzMatrixFrom(distanzArray, p(k).getArray(),k);
        }
        return new Matrix(distanzArray);
    }
    private static void updateDistanzMatrixFrom(Integer[][] distanzMatrix, Integer[][] potenzMatrix, int weglaenge) {
        for (int zeile = 0; zeile < distanzMatrix.length ; zeile++) {
            for (int spalte=0;spalte < distanzMatrix[zeile].length;spalte++) {
                if (distanzMatrix[zeile][spalte] != null) continue;
                // Hier ist infinity, evtl. durch Potenzmatrix upzudaten!!
                if (potenzMatrix[zeile][spalte] > 0) {
                    distanzMatrix[zeile][spalte] = weglaenge;
                }
            }
        }
    }
    private static boolean noInfinityIn(Integer[][] testArray) {
        for (Integer[] zeile: testArray) {
            for (Integer spalte: zeile) {
                if (spalte == null) return false;
            }
        }
        return true;
    }
    public int[] getKnotengrade() {
        if (getRows() != getCols()) {
            throw new IllegalStateException("Sorry, ist nur für quadratische Matrizen definiert.");
        }
        int[] result = new int[getCols()];
        for (int zeile = 0; zeile < getRows(); zeile++) {
            // zeile ... aktueller Knoten
            for (int spalte = 0; spalte < getCols(); spalte++) {
                result[zeile] += array[zeile][spalte];
            }
        }
        return result;
    }

    public Matrix p2() {
        return multiply(this);
    }

    public Matrix p(int n) {
        if (n < 1) throw new IllegalArgumentException("sorry weiss nicht wie ich das tun soll");
        if (n == 1) return this;
        Matrix result = multiply(this); // dzt. result = this^2
        for (int i = 2; i < n; i++) {
            result = result.multiply(this);
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.getCols() != other.getRows()) {
            throw new IllegalArgumentException("Incompatible matrix sizes for multiplication.");
        }

        Integer[][] result = new Integer[this.getRows()][other.getCols()];
        for (Integer[] zeile: result) {
            for (int spalte = 0; spalte < zeile.length; spalte++){
                zeile[spalte] = 0;
            }
        }

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < other.getCols(); j++) {
                for (int k = 0; k < this.getCols(); k++) {
                    result[i][j] += this.array[i][k] * other.array[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer[] row : array) {
            sb.append("[");
            for (int val : row) {
                sb.append(val).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1); // Remove last space
            sb.append("]\n");
        }
        return sb.toString();
    }

}
