
/**
 * Write a description of class SameEqual here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SameEqual {

    public boolean equals (Object other) {
        return false;
    }

    public static void demoEq () {
        SameEqual first = new SameEqual();
        SameEqual second = first;
        System.out.println (first == second);
        System.out.println (first.equals(first));
    }

    public static void sameOrEqual () {
        String a = "Hallo";
        String b = "Hallo";
        boolean same = a == b;
        System.out.println("same? " + same); 
        boolean equal = a.equals(b);
        System.out.println("equal? " + equal);
    }
}