// Fig 8.5: ModifiedTime2.java
// ModifiedTime2 class declaration with overloaded constructors.
/* Exercise 8.5 assignment: modifying the ModifiedTime2 class of Fig 8.5 to 
implement the time as the number of seconds since midnight and to show that no 
change is visible to the clients of the class.
 */
package e85.pkg;

// @author Michael Kester
public class ModifiedTime2 {

// seconds since midnight
    private int ssm;

    // Set Methods
    public final void setTime(int hour, int minute, int second) {
        setHour(hour); // uses the setHour method to set the hour
        setMinute(minute); // uses the setMinute method to set the minute
        setSecond(second); // uses the setSecond method to set the second
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        /*
        Since hour is the input in this method, uses the getMinute and getSecond
        methods to get the minutes and seconds, respectively
         */
        ssm = (hour * 3600) + (getMinute() * 60) + getSecond();
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        /*
        Since minute is the input in this method, uses the getHour and getSecond
        methods to get the hours and seconds, respectively
         */
        ssm = (getHour() * 3600) + (minute * 60) + getSecond();
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        /*
        Since second is the input in the method, uses the getHour and getMinute
        methods to get the hours and minutes, respectively
         */
        ssm = (getHour() * 3600) + (getMinute() * 60) + second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return ssm / 3600; // given formula
    }

    // get minute value
    public int getMinute() {
        return (ssm % 3600) / 60; // given formula
    }

    // get second value
    public int getSecond() {
        return ssm % 60; // given formula
    }

    // ModifiedTime2 constructor: all variables supplied
    public ModifiedTime2(int hour, int minute, int second) {
        setTime(hour, minute, second); //invoke setTime to validate time
    }

    // no-argument constructor: initializes ssm to zero
    public ModifiedTime2() {
        ssm = 0;
    }

    // constructor: one variable (hour) supplied, the rest defaulted to zero
    public ModifiedTime2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    /*
    constructor: two variables (hour and minute) supplied, others defaulted to 
    zero
    */
    public ModifiedTime2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // ModifiedTime2 constructor: another ModifiedTime2 object supplied
    public ModifiedTime2(ModifiedTime2 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // convert to String in universal-time format (HH:MM:SS)
    // same as figure 8.5
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(),
                getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    // same as figure 8.5
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour()
                == 12) ? 12 : getHour() % 12), getMinute(), getSecond(),
                (getHour() < 12 ? "AM" : "PM"));
    }
} // end class ModifiedTime2
