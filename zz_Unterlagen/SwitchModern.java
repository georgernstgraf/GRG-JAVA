public class SwitchModern {

    // Assume Shape, Circle, Square, Rectangle are defined as in the
    // sealed interface example from the previous answer.
    sealed interface Shape permits Circle, Square, Rectangle {
        double area();
    }

    final record Circle(double radius) implements Shape {
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    final record Square(double side) implements Shape {
        public double area() {
            return side * side;
        }
    }

    non-sealed record Rectangle(double length, double width) implements Shape {
        public double area() {
            return length * width;
        }
    }

    // Adding a subtype to Rectangle to show non-sealed effect later if needed
    final record TiltedRectangle(double length, double width, double angle) implements Rectangle {
        public TiltedRectangle(double length, double width) {
            this(length, width, 0);
        } // Constructor

        @Override
        public double area() {
            return super.area();
        }
    }

    static String process(Object obj) {
        // Using switch as an EXPRESSION (it returns a value)
        return switch (obj) {
            // 1. Case with Type Pattern (String) and variable 's'
            case String s -> "Got a String: " + s;

            // 2. Case with Type Pattern (Integer) and variable 'i'
            case Integer i -> "Got an Integer: " + i;

            // 3. Case with Type Pattern (LocalDate) and arrow block
            case LocalDate d -> {
                System.out.println("Processing a date...");
                yield "Date is: " + d.format(DateTimeFormatter.ISO_DATE); // 'yield' used in switch expression blocks
            }

            // 4. Case with Guarded Pattern (when)
            case Shape sh when sh.area() > 100.0 -> "Got a LARGE Shape with area: " + sh.area();

            // 5. Cases for specific sealed subtypes (compiler checks exhaustiveness for
            // Shape)
            // (Note: Rectangle is non-sealed, so TiltedRectangle could exist)
            case Circle c -> "Got a Circle with radius " + c.radius();
            case Square sq -> "Got a Square with side " + sq.side();
            // This case implicitly covers Rectangle AND its subtypes like TiltedRectangle
            case Rectangle r -> "Got a Rectangle (or subtype) with length " + r.length();

            // 6. Handling null explicitly
            case null -> "Got null!";

            // 7. Default case (often needed if switching on a non-sealed type like Object)
            default -> "Got something else: " + obj.getClass().getName();
        };
    }

    public static void main(String[] args) {
        System.out.println(process("Hello"));
        System.out.println(process(123));
        System.out.println(process(LocalDate.now())); // Current date (e.g., 2025-04-04)
        System.out.println(process(new Circle(5))); // Area approx 78.5
        System.out.println(process(new Square(11))); // Area 121.0 (will hit the guarded pattern)
        System.out.println(process(new Rectangle(4, 5))); // Area 20.0
        System.out.println(process(new TiltedRectangle(5, 6))); // Area 30.0 (matches Rectangle case)
        System.out.println(process(null));
        System.out.println(process(99.9)); // Double -> default case
    }
}
