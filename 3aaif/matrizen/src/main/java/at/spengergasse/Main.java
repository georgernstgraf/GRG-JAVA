package at.spengergasse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Matrix a = new Matrix(new int[][]{
                {1, 2}, {3, 4}, {5, 6}, {7, 8}
        });
        Matrix b = new Matrix(new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        });
        Matrix c = a.multiply(b);
        System.out.println(c);
    }
}
