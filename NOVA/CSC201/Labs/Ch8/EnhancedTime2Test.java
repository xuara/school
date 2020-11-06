/* driver class to test added methods tick(), incrementMinute(), and
incrementHour()
 */
package e87.pkg;
// @author Michael Kester

public class EnhancedTime2Test {

    // displays a ModifiedTime2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, EnhancedTime2 t) {
        System.out.printf("%s%n    %s%n    %s%n", header,
                t.toUniversalString(), t.toString());
    }

    public static void main(String[] args) {

        //constructs three EnhancedTime2 objects
        EnhancedTime2 t1 = new EnhancedTime2(23, 59, 59);
        EnhancedTime2 t2 = new EnhancedTime2(13, 37, 42);
        EnhancedTime2 t3 = new EnhancedTime2(11, 30, 0);

        //Outputs initial values
        System.out.println("Constructed with:");
        displayTime("t1: ", t1);
        displayTime("t2: ", t2);
        displayTime("t3: ", t3);
        System.out.println();

        t1.tick(); // increments t1 by a second
        t2.incrementMinute(); // increments t2 by a minute
        t3.incrementHour(); // increments t3 by an hour

        //Outputs after values changed
        System.out.println("New values: ");
        displayTime("t1: (one second later)", t1);
        displayTime("t2: (one minute later)", t2);
        displayTime("t3: (one hour later)", t3);
    }

}
