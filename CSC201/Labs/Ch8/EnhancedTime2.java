/*
Same as Fig. 8.5, but with the addition of three methods:
tick() - increments time by one second
incrementMinute() - increments time by one minute
incrementHour() - increments time by one hour
 */
package e87.pkg;
// @author Michael Kester

public class EnhancedTime2 {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    /*
    method that increments the second by one, accounting for incrementing in to
    the next day, hour or minute
     */
    public void tick() {
        if (second >= 0 && second < 59) {
            second++;
        }
        if (second == 59 && minute >= 0 && minute < 59) {
            second = 0;
            minute++;
        }
        if (hour == 23 && minute == 59 && second == 59) {
            minute = 0;
            hour = 0;
            second = 0;
        }
        if (second == 59 && minute == 59) {
            second = 0;
            minute = 0;
            hour++;
        }
    }

    /*
    method that increments the minute by one, accounting for incrementing in to
    the next day or hour
     */
    public void incrementMinute() {
        if (minute >= 0 && minute < 59) {
            minute++;
        }

        if (minute == 59 && hour >= 0 && hour < 23) {
            minute = 0;
            hour++;
        }

        if (minute == 59 && hour == 23) {
            minute = 0;
            hour = 0;
        }

    }

    /*
    method that increments the hour by one, accounting for incrementing in to
    the next day
     */
    public void incrementHour() {
        if (hour >= 0 && hour < 23) {
            hour++;
        }
        if (hour == 23) {
            hour = 0;
        }
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // EnhancedTime2 constructor: hour and minute and second supplied
    public EnhancedTime2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // no-argument constructor:
    // initializes each instance variable to zero
    public EnhancedTime2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // constructor: hour supplied, minute and second defaulted to zero
    public EnhancedTime2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // constructor: hour and minute supplied, second defaulted to zero
    public EnhancedTime2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // constructor: another EnhancedTime2 object supplied
    public EnhancedTime2(EnhancedTime2 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(),
                getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour()
                == 12) ? 12 : getHour() % 12), getMinute(), getSecond(),
                (getHour() < 12 ? "AM" : "PM"));
    }
} // end class EnhancedTime2
