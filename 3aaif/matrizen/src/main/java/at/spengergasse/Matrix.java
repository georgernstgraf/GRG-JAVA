package at.spengergasse;

public class Matrix {
    private int[][] array;

    public Matrix(int[][] array) {
        this.array = array;
    }

    public int getRows() {
        return array.length;
    }

    public int getCols() {
        return array[0].length;
    }

    public Matrix p2 () {
        return multiply(this);
    }
    public Matrix p(int n) {
        if (n < 1) throw new IllegalArgumentException("sorry weiss nicht wie ich das tun soll");
        if (n == 1) return this;
        Matrix result = multiply(this); // dzt. result = this^2
        for (int i = 2; i < n; i++ ) {
            result = result.multiply(this);
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.getCols() != other.getRows()) {
            throw new IllegalArgumentException("Incompatible matrix sizes for multiplication.");
        }

        int[][] result = new int[this.getRows()][other.getCols()];

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
        for (int[] row : array) {
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
