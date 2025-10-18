
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        System.out.println("executing setUp()");
    }

    @Test
    public void testBMI () {
        //throw new IllegalArgumentException("es ist mir nix besseres eingefallen");
        //assert(false);
        // kein Code bedeutet Test wird gut gehen ... TODO
    }

    @Test
    public void testWertung() {
        Student student = new Student("Ferdinand", true, 181, 100);
        assertEquals("Übergewichtig", student.bmi_werter(), "BMI Wertung");
        System.out.println(student);    
        // student = new Student("Harald", false, 200, 65);
        // assertEquals("Untergewichtig", 
    }

    @Test
    public void testFalscherNameThrows() {
        Student stud;
        try {
            stud = new Student("Fe", true, 180, 70);  // exception erwartet!!
            // sehr patscherte Art, um eine AssertionException zu werfen:
            // assertEquals(true, false, "student wurde trotz zu kurzem Namen erzeugt");
            fail("student wurde trotz zu kurzem Namen erzeugt");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception gefangen: " + e.getMessage());
        }
    }

    @AfterEach
    public void tearDown()
    {
        System.out.println("executing tearDown()");
    }
}
