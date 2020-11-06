package e713.pkg;
// @author Michael Kester

public class DateTest {

    public static void main(String[] args) {
        Date atomic = new Date(8, 6, 1945);
        Date today = new Date(1, 21, 2016);
        Date invalid = new Date(13, 666, 1337);

        atomic.displayDate();
        today.displayDate();
        invalid.displayDate();
    } //end main
} //end class DateTest
