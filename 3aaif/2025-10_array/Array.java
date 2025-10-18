
/**
 * Klasse Array
 * 
 * @author (WES) 
 * @version (2025-10-16)
 */
public class Array
{
    private int[] array1;
    private int[] array2;
    private Student[] students;
    private Student anna;
    public Array()
    {
        array1 = new int[] {1,2,3,4};
        array2 = new int[10];
        students = new Student[10];
    }
    public void annaInStudentsAufnehmen()
    {
        Student anna = new Student("Anna", 65.0f, 180, 'f'); // 1. anna-Ref.
        this.anna = anna; // this.anna 2. anna-Ref.
        students[0] = anna;  // 3. Referenz im students-Array beim index0
        // Wie viele anna-Referenzen haben wir? 3, siehe oben
        // Wie viele Anna-Objekte gibt es? 1
        // Wie viele anna-Referenzen gibt es nach dem Methodenaufruf insgesamt? 2
        // anna aus Zeile 22 wird entsorgt, weil es eine lokale Variable war
    }
    public void index0VonStudentsHolen()
    {
       Student tmp = students[0];
       if (anna == tmp)
       {
           System.out.println("tmp und anna sind referenz-gleich");
           System.out.println("tmp: " + tmp);
           System.out.println("anna: " + anna);           
       }
       else
       {
          System.out.println("tmp und anna sind referenz-ungleich"); 
       }
    }
    
    public void printArray1()
    {
        System.out.println("Index:\tWert"); 
        for (int i = 0; i < array1.length; i++)
        {
           System.out.println(i + ":\t" + array1[i]); 
        }
    }    
    
    public void printStudents()
    {
        System.out.println("Index:\tWert"); 
        for (int i = 0; i < students.length; i++)
        {
           System.out.println(i + ":\t" + students[i]); 
        }
    }    
}
