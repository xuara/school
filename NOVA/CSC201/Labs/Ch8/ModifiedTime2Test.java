// Fig 8.6: ModifiedTime2Test.java
// Overloaded constructors used to initialize ModifiedTime2 objects.
// Everything is the same as the original Fig 8.6
package e85.pkg;
// @author Michael Kester

public class ModifiedTime2Test {

    // displays a ModifiedTime2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, ModifiedTime2 t) {
        System.out.printf("%s%n    %s%n    %s%n", header,
                t.toUniversalString(), t.toString());
    }

    public static void main(String[] agrs) {

        ModifiedTime2 t1 = new ModifiedTime2(); // 00:00:00
        ModifiedTime2 t2 = new ModifiedTime2(2); // 02:00:00
        ModifiedTime2 t3 = new ModifiedTime2(21, 34); // 21:34:00
        ModifiedTime2 t4 = new ModifiedTime2(12, 25, 42); // 12:25:42
        ModifiedTime2 t5 = new ModifiedTime2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute, and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        //attempt to initialize t6 with invalid values
        try {
            ModifiedTime2 t6 = new ModifiedTime2(27, 74, 99); //invalid values
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n",
                    e.getMessage());
        }
    }
} // end class ModifiedTime2Test
